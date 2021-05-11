package com.example.brewmap;

import com.example.brewmap.mock.MockNetworkModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules={MockNetworkModule.class, AndroidTestModule.class})
public interface AndroidTestComponent extends BrewmapApplicationComponent {
}
