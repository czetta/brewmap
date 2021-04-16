package com.example.brewmap;

import com.example.brewmap.ui.UIModule;
import com.example.brewmap.ui.main.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules={UIModule.class})
public interface BrewmapApplicationComponent {
    void inject(MainActivity mainActivity);

}
