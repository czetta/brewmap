package com.example.brewmap.mock;

import com.example.brewmap.model.Brewery;
import com.example.brewmap.network.BreweryApi;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Request;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.Path;
import retrofit2.http.Query;

public class MockBreweryApi implements BreweryApi {
    @Override
    public Call<List<com.example.brewmap.data.Brewery>> breweriesGet() {
        final List<Brewery> result = new ArrayList<>();
        Brewery brewery=sampleBrewery();

        result.add(brewery);
        return new Call<List<Brewery>>(){
            @Override
            public Response<List<Brewery>> execute() throws IOException {
                return Response.success(result);
            }

            @Override
            public void enqueue(Callback<List<Brewery>> callback) {

            }

            @Override
            public boolean isExecuted() {
                return false;
            }

            @Override
            public void cancel() {

            }

            @Override
            public boolean isCanceled() {
                return false;
            }

            @Override
            public Call<List<Brewery>> clone() {
                return null;
            }

            @Override
            public Request request() {
                return null;
            }
        };
    }

    @Override
    public Call<Void> breweriesPost(@Body Brewery body) {
        return null;
    }

    @Override
    public Call<List<Brewery>> breweriesSearchGet(@Query("query") String query) {
        return null;
    }

    @Override
    public Call<Brewery> breweriesIdGet(@Path("id") Long id) {
        return null;
    }

    @Override
    public Call<Void> breweriesIdPut(@Path("id") Long id, @Body Brewery body) {
        return null;
    }

    @Override
    public Call<Void> breweriesIdDelete(@Path("id") Long id) {
        return null;
    }

    private Brewery sampleBrewery(){
        Brewery brewery=new Brewery();
        brewery.setName("Brewing Brewery");
        brewery.setStreet("Utca utca 1.");
        brewery.setCity("City");
        brewery.setPhone("+360123456789");
        brewery.setWebsiteUrl("asdf.ghjk.org");
        return brewery;
    }
}
