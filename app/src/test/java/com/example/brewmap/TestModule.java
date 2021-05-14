package com.example.brewmap;

import android.content.Context;

import com.example.brewmap.di.Network;
import com.example.brewmap.utils.UiExecutor;

import java.util.concurrent.Executor;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class TestModule {
    private Context context;
    public TestModule(Context context){
        this.context=context;
    }
    @Provides
    public Context provideContext(){
        return context;
    }
    @Provides
    @Singleton
    @Network
    public Executor provideNetworkExecutor(){
        return new UiExecutor();
    }
}
