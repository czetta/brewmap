package com.example.brewmap;

import android.app.Application;

import com.example.brewmap.ui.UIModule;

public class BrewmapApplication extends Application {
  public static BrewmapApplicationComponent injector;

  @Override
  public void onCreate(){
    super.onCreate();
    injector=DaggerBrewmapApplicationComponent.builder().uIModule(new UIModule(this)).build();
  }
}
