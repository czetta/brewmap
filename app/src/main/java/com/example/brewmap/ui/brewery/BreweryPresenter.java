package com.example.brewmap.ui.brewery;

import com.example.brewmap.di.Network;
import com.example.brewmap.interactor.brewery.BreweryInteractor;
import com.example.brewmap.ui.Presenter;

import java.util.concurrent.Executor;

import javax.inject.Inject;

public class BreweryPresenter extends Presenter<BreweryScreen> {
    Executor networkExecutor;
    BreweryInteractor breweryInteractor;

    @Inject
    public BreweryPresenter(@Network Executor networkExecutor, BreweryInteractor breweryInteractor){
        this.networkExecutor=networkExecutor;
        this.breweryInteractor=breweryInteractor;
    }
}
