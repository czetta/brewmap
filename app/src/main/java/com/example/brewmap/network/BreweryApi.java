package com.example.brewmap.network;

import retrofit2.Call;
import retrofit2.http.*;

import com.example.brewmap.model.Brewery;

import java.util.List;

public interface BreweryApi {

  /**
   *
   *
   * @return Call<List<Brewery>>
   */

  @GET("breweries")
  Call<List<Brewery>> breweriesGet();



  /**
   *
   *
   * @param body
   * @return Call<Void>
   */

  @POST("breweries")
  Call<Void> breweriesPost(
          @Body Brewery body
  );


  /**
   *
   *
   * @param query
   * @return Call<List<Brewery>>
   */

  @GET("breweries/search")
  Call<List<Brewery>> breweriesSearchGet(
          @Query("query") String query
  );


  /**
   *
   *
   * @param id
   * @return Call<Brewery>
   */

  @GET("breweries/{id}")
  Call<Brewery> breweriesIdGet(
          @Path("id") Long id
  );


  /**
   *
   *
   * @param id
   * @param body
   * @return Call<Void>
   */

  @PUT("breweries/{id}")
  Call<Void> breweriesIdPut(
          @Path("id") Long id, @Body Brewery body
  );


  /**
   *
   *
   * @param id
   * @return Call<Void>
   */

  @DELETE("breweries/{id}")
  Call<Void> breweriesIdDelete(
          @Path("id") Long id
  );


}
