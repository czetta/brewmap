package com.example.brewmap.interactor.brewery.event;

import com.example.brewmap.model.Brewery;

import java.util.List;

public class GetQueriedBreweriesEvent {
  private int code;
  private List<Brewery> breweries;
  private Throwable throwable;

  public GetQueriedBreweriesEvent(){}
  public GetQueriedBreweriesEvent(int code, List<Brewery> breweries, Throwable throwable){
    this.code=code;
    this.breweries=breweries;
    this.throwable=throwable;
  }

  public int getCode() {
    return code;
  }
  public void setCode(int code) {
    this.code = code;
  }

  public List<Brewery> getBreweries(){
    return breweries;
  }
  public void setBreweries(List<Brewery> breweries){
    this.breweries=breweries;
  }

  public Throwable getThrowable() {
    return throwable;
  }

  public void setThrowable(Throwable throwable) {
    this.throwable = throwable;
  }
}