package com.sid.gl.streamapi.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sid.gl.streamapi.dto.CountryDTO;
import com.sid.gl.streamapi.entity.Country;
import com.sid.gl.streamapi.exceptions.CountryException;
import com.sid.gl.streamapi.repositories.CountryMapper;
import com.sid.gl.streamapi.repositories.CountryRepository;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

@Service
public class CountryService {
  private final CountryRepository countryRepository;
  private List<Country> countryList;


  public CountryService(CountryRepository countryRepository) {
    this.countryRepository = countryRepository;
  }

  @PostConstruct
  public void setup(){
    ObjectMapper mapper= new ObjectMapper();
    try {
      InputStream countries = new ClassPathResource("/countries/countries.json").getInputStream();
      countryList= Arrays.asList(mapper.readValue(countries,Country[].class));
      //save on database
      countryList.forEach(countryRepository::save);
      countries.close();
    }catch (IOException e){
      throw new RuntimeException(e.getMessage());

    }
  }

  public List<CountryDTO> listCountries(){
    return countryRepository.findAll()
        .stream()
        .map(CountryMapper::map)
        .collect(Collectors.toList());
  }


}
