package com.example.brewmap.interactor.brewery.event;

import com.example.brewmap.model.Brewery;

public class GetBreweryEvent {
    private int code;
    private Brewery brewery;
    private Throwable throwable;

    public GetBreweryEvent(){}
    public GetBreweryEvent(int code, Brewery brewery, Throwable throwable){
        this.code = code;
        this.brewery = brewery;
        this.throwable = throwable;
    }

    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }

    public Brewery getBrewery(){
        return brewery;
    }
    public void setBrewery(Brewery brewery){
        this.brewery=brewery;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public void setThrowable(Throwable throwable) {
        this.throwable = throwable;
    }
}
