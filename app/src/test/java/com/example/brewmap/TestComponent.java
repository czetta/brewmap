package com.example.brewmap;

import com.example.brewmap.mock.MockNetworkModule;
import com.example.brewmap.test.MainTest;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {MockNetworkModule.class, TestModule.class})
public interface TestComponent extends BrewmapApplicationComponent {
    void inject(MainTest mainTest);
}
