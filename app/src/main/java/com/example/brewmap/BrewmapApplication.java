package com.example.brewmap;

import android.app.Application;

public class BrewmapApplication extends Application {
    public static BrewmapApplicationComponent injector;

    @Override
    public void onCreate(){
        super.onCreate();
    }
}
