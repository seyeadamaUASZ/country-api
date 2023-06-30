package com.sid.gl.streamapi.repositories;

import com.sid.gl.streamapi.dto.CountryDTO;
import com.sid.gl.streamapi.entity.Country;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.BeanUtils;


public interface CountryMapper {

  static List<CountryDTO> map(List<Country> countries){
    return countries.stream().map(CountryMapper::map).collect(Collectors.toList());
  }

  static CountryDTO map(Country country){
    CountryDTO countryDTO = new CountryDTO();
    BeanUtils.copyProperties(country,countryDTO);
    return countryDTO;
  }

}
