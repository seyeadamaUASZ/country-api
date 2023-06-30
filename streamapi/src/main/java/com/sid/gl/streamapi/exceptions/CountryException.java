package com.sid.gl.streamapi.exceptions;

public class CountryException extends RuntimeException{
  private String message;

  public CountryException(String message){
    this.message = message;
    System.out.println(this.message);
  }

}
