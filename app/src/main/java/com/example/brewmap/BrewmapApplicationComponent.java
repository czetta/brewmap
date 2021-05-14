package com.example.brewmap;

import com.example.brewmap.interactor.brewery.BreweryInteractor;
import com.example.brewmap.network.NetworkModule;
import com.example.brewmap.ui.UIModule;
import com.example.brewmap.ui.brewery.BreweryActivity;
import com.example.brewmap.ui.brewery.BreweryPresenter;
import com.example.brewmap.ui.details.DetailsActivity;
import com.example.brewmap.ui.main.MainActivity;
import com.example.brewmap.ui.main.MainPresenter;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules={UIModule.class, NetworkModule.class})
public interface BrewmapApplicationComponent {
    void inject(MainActivity mainActivity);
    void inject(BreweryInteractor breweryInteractor);
    void inject(BreweryActivity breweryActivity);
    void inject(DetailsActivity detailsActivity);
}
