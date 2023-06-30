package com.sid.gl.streamapi.controller;

import com.sid.gl.streamapi.dto.CountryDTO;
import com.sid.gl.streamapi.service.CountryService;
import com.sid.gl.streamapi.utils.Api;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(Api.APICOUNTRY)
public class CountryController {

  private final CountryService service;

  public CountryController(CountryService service) {
    this.service = service;
  }

  @GetMapping
  public List<CountryDTO> list(){
    return service.listCountries();
  }

}
