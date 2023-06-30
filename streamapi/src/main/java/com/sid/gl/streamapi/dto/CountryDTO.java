package com.sid.gl.streamapi.dto;

import java.util.List;

public class CountryDTO {
  private String name;
  private String flag;
  private String code;
  private String capital;
  private String dial_code;
  private double population;
  private double superficie;
  private boolean independent;
  private List<String> languages;
  private String continents;
  private String googleMaps;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getFlag() {
    return flag;
  }

  public void setFlag(String flag) {
    this.flag = flag;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getCapital() {
    return capital;
  }

  public void setCapital(String capital) {
    this.capital = capital;
  }

  public String getDial_code() {
    return dial_code;
  }

  public void setDial_code(String dial_code) {
    this.dial_code = dial_code;
  }

  public double getPopulation() {
    return population;
  }

  public void setPopulation(double population) {
    this.population = population;
  }

  public double getSuperficie() {
    return superficie;
  }

  public void setSuperficie(double superficie) {
    this.superficie = superficie;
  }

  public boolean isIndependent() {
    return independent;
  }

  public void setIndependent(boolean independent) {
    this.independent = independent;
  }

  public List<String> getLanguages() {
    return languages;
  }

  public void setLanguages(List<String> languages) {
    this.languages = languages;
  }

  public String getContinents() {
    return continents;
  }

  public void setContinents(String continents) {
    this.continents = continents;
  }

  public String getGoogleMaps() {
    return googleMaps;
  }

  public void setGoogleMaps(String googleMaps) {
    this.googleMaps = googleMaps;
  }
}
