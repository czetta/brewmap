package com.example.brewmap.interactor.brewery;

import com.example.brewmap.BrewmapApplication;
import com.example.brewmap.interactor.brewery.event.DelBreweryEvent;
import com.example.brewmap.interactor.brewery.event.GetBreweriesEvent;
import com.example.brewmap.interactor.brewery.event.GetBreweryEvent;
import com.example.brewmap.interactor.brewery.event.GetQueriedBreweriesEvent;
import com.example.brewmap.interactor.brewery.event.PostBreweryEvent;
import com.example.brewmap.interactor.brewery.event.PutBreweryEvent;
import com.example.brewmap.model.Brewery;
import com.example.brewmap.network.BreweryApi;

import org.greenrobot.eventbus.EventBus;

import java.util.List;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Response;

public class BreweryInteractor {
  BreweryApi breweryApi;

  @Inject
  public BreweryInteractor(BreweryApi breweryApi){
    this.breweryApi=breweryApi;
    BrewmapApplication.injector.inject(this);
  }

  public void getBreweries(){
    GetBreweriesEvent event = new GetBreweriesEvent();
    try{
      Call<List<Brewery>> breweriesCall = breweryApi.breweriesGet();
      Response<List<Brewery>> response = breweriesCall.execute();
      if(response.code()!=200) throw new Exception();
      event.setCode(response.code());
      event.setBreweries(response.body());
      EventBus.getDefault().post(event);
    } catch (Exception e) {
      event.setThrowable(e);
      EventBus.getDefault().post(event);
    }
  }
  public void getQueriedBreweries(String query){
    GetQueriedBreweriesEvent event = new GetQueriedBreweriesEvent();
    try{
      Call<List<Brewery>> breweriesCall = breweryApi.breweriesSearchGet(query);
      Response<List<Brewery>> response = breweriesCall.execute();
      if(response.code()!=200) throw new Exception();
      event.setCode(response.code());
      event.setBreweries(response.body());
      EventBus.getDefault().post(event);
    } catch (Exception e) {
      event.setThrowable(e);
      EventBus.getDefault().post(event);
    }
  }
  public void getBrewery(Long id){
    GetBreweryEvent event = new GetBreweryEvent();
    try{
      Call<Brewery> breweryCall = breweryApi.breweriesIdGet(id);
      Response<Brewery> response = breweryCall.execute();
      if(response.code()!=200) throw new Exception();
      event.setCode(response.code());
      event.setBrewery(response.body());
      EventBus.getDefault().post(event);
    } catch (Exception e) {
      event.setThrowable(e);
      EventBus.getDefault().post(event);
    }
  }
  public void postBrewery(Brewery brewery){
    PostBreweryEvent event = new PostBreweryEvent();
    try{
      Call<Void> breweryCall = breweryApi.breweriesPost(brewery);
      Response<Void> response = breweryCall.execute();
      if(response.code()!=200) throw new Exception();
      event.setCode(response.code());
      EventBus.getDefault().post(event);
    } catch (Exception e) {
      event.setThrowable(e);
      EventBus.getDefault().post(event);
    }
  }
  public void putBrewery(Long id, Brewery brewery){
    PutBreweryEvent event = new PutBreweryEvent();
    try{
      Call<Void> breweryCall = breweryApi.breweriesIdPut(id,brewery);
      Response<Void> response = breweryCall.execute();
      if(response.code()!=200) throw new Exception();
      event.setCode(response.code());
      EventBus.getDefault().post(event);
    } catch (Exception e) {
      event.setThrowable(e);
      EventBus.getDefault().post(event);
    }
  }
  public void delBrewery(Long id){
    DelBreweryEvent event = new DelBreweryEvent();
    try{
      Call<Void> breweryCall = breweryApi.breweriesIdDelete(id);
      Response<Void> response = breweryCall.execute();
      if(response.code()!=200) throw new Exception();
      event.setCode(response.code());
      EventBus.getDefault().post(event);
    } catch (Exception e) {
      event.setThrowable(e);
      EventBus.getDefault().post(event);
    }
  }
}
