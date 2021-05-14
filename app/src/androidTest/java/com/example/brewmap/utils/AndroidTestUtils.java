package com.example.brewmap.utils;

import android.app.Instrumentation;

import androidx.test.platform.app.InstrumentationRegistry;

import com.example.brewmap.AndroidTestComponent;
import com.example.brewmap.AndroidTestModule;
import com.example.brewmap.BrewmapApplication;
import com.example.brewmap.DaggerAndroidTestComponent;

public class AndroidTestUtils {
    public static void setTestInjector(){
        Instrumentation instrumentation= InstrumentationRegistry.getInstrumentation();
        BrewmapApplication app=(BrewmapApplication)instrumentation.getTargetContext().getApplicationContext();
        AndroidTestComponent androidTestComponent= DaggerAndroidTestComponent.builder().androidTestModule(new AndroidTestModule(app)).build();
        app.injector=androidTestComponent;
    }
}
