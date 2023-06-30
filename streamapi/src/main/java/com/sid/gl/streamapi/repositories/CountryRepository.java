package com.sid.gl.streamapi.repositories;

import com.sid.gl.streamapi.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country,String> {

}
