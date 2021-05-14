package com.example.brewmap.network;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class NetworkModule {
  @Provides
  @Singleton
  public Retrofit.Builder provideRetrofit(){
    return new Retrofit.Builder().addConverterFactory(GsonConverterFactory.create());
  }

  @Provides
  @Singleton
  public BreweryApi provideBreweryApi(@org.jetbrains.annotations.NotNull Retrofit.Builder retrofitBuilder){
    return retrofitBuilder.baseUrl(NetworkConfig.ENDPOINT_ADDRESS).build().create(BreweryApi.class);
  }
}
