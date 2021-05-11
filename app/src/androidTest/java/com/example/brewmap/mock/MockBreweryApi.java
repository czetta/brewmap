package com.example.brewmap.mock;

import androidx.room.Room;

import com.example.brewmap.data.AppDatabase;
import com.example.brewmap.data.BreweryDao;
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

import static androidx.test.core.app.ApplicationProvider.getApplicationContext;

public class MockBreweryApi implements BreweryApi {
    static AppDatabase db = Room.databaseBuilder(getApplicationContext(), AppDatabase.class, "breweries").build();
    BreweryDao breweryDao=db.breweryDao();

    @Override
    public Call<List<Brewery>> breweriesGet() {
        final List<Brewery> result = new ArrayList<>();
        /*Brewery brewery=sampleBrewery();
        breweryDao.insertBrewery(brewery);*/
        result.addAll(breweryDao.getAll());
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
        breweryDao.insertBrewery(body);
        return new Call<Void>(){
            @Override
            public Response<Void> execute() throws IOException {
                return Response.success(null);
            }

            @Override
            public void enqueue(Callback<Void> callback) {

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
            public Call<Void> clone() {
                return null;
            }

            @Override
            public Request request() {
                return null;
            }
        };
    }

    @Override
    public Call<List<Brewery>> breweriesSearchGet(@Query("query") String query) {
        final List<Brewery> result = new ArrayList<>();
        /*Brewery brewery=sampleBrewery();
        breweryDao.insertBrewery(brewery);*/
        result.addAll(breweryDao.findByName(query));
        return new Call<List<Brewery>>() {
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
    public Call<Brewery> breweriesIdGet(@Path("id") Long id) {
        Brewery result;
        /*Brewery brewery=sampleBrewery();
        breweryDao.insertBrewery(brewery);*/
        result=breweryDao.findById(id);
        return new Call<Brewery>() {
            @Override
            public Response<Brewery> execute() throws IOException {
                return Response.success(result);
            }

            @Override
            public void enqueue(Callback<Brewery> callback) {

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
            public Call<Brewery> clone() {
                return null;
            }

            @Override
            public Request request() {
                return null;
            }
        };
    }

    @Override
    public Call<Void> breweriesIdPut(@Path("id") Long id, @Body Brewery body) {
        body.setId(id);
        breweryDao.updateBrewery(body);
        return new Call<Void>() {
            @Override
            public Response<Void> execute() throws IOException {
                return Response.success(null);
            }

            @Override
            public void enqueue(Callback<Void> callback) {

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
            public Call<Void> clone() {
                return null;
            }

            @Override
            public Request request() {
                return null;
            }
        };
    }

    @Override
    public Call<Void> breweriesIdDelete(@Path("id") Long id) {
        breweryDao.delete(breweryDao.findById(id));
        return new Call<Void>() {
            @Override
            public Response<Void> execute() throws IOException {
                return Response.success(null);
            }

            @Override
            public void enqueue(Callback<Void> callback) {

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
            public Call<Void> clone() {
                return null;
            }

            @Override
            public Request request() {
                return null;
            }
        };
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
