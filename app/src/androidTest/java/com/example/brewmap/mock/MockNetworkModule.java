package com.example.brewmap.mock;

import com.example.brewmap.network.BreweryApi;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class MockNetworkModule {
    @Provides
    @Singleton
    public Retrofit.Builder provideRetrofit(){
        return new Retrofit.Builder().addConverterFactory(GsonConverterFactory.create());
    }

    @Provides
    @Singleton
    public BreweryApi provideBreweryApi(Retrofit.Builder retrofitBuilder){
        return new MockBreweryApi();
    }
}
