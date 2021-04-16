package com.example.brewmap.interactor.brewery;

import com.example.brewmap.BrewmapApplication;
import com.example.brewmap.network.BreweryApi;

import javax.inject.Inject;

public class BreweryInteractor {
    BreweryApi breweryApi;

    @Inject
    public BreweryInteractor(BreweryApi breweryApi){
        this.breweryApi=breweryApi;
        BrewmapApplication.injector.inject(this);
    }

    public void getBrewery(){}

}
