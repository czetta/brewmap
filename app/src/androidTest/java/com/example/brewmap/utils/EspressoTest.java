package com.example.brewmap.utils;

import android.app.Activity;
import android.app.Instrumentation;
import android.content.Context;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;

public class EspressoTest<T extends Activity> {
    @Rule
    public ActivityTestRule<T> activityRule;
    protected Context context;

    public EspressoTest(Class<T> activityClass){
        activityRule=new ActivityTestRule<T>(activityClass);
        Instrumentation instrumentation = InstrumentationRegistry.getInstrumentation();
        context= instrumentation.getTargetContext().getApplicationContext();
    }
}
