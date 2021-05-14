package com.example.brewmap.ui.main;

import com.example.brewmap.di.Network;
import com.example.brewmap.interactor.brewery.BreweryInteractor;
import com.example.brewmap.interactor.brewery.event.GetQueriedBreweriesEvent;
import com.example.brewmap.model.Brewery;
import com.example.brewmap.ui.Presenter;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.concurrent.Executor;

import javax.inject.Inject;

public class MainPresenter extends Presenter<MainScreen> {
    Executor networkExecutor;
    BreweryInteractor breweryInteractor;

    @Inject
    public MainPresenter(@Network Executor networkExecutor, BreweryInteractor breweryInteractor){
        this.networkExecutor=networkExecutor;
        this.breweryInteractor=breweryInteractor;
    }

    @Override
    public void attachScreen(MainScreen screen){
        super.attachScreen(screen);
        EventBus.getDefault().register(this);
    }

    @Override
    public void detachScreen(){
        EventBus.getDefault().unregister(this);
        super.detachScreen();
    }

    public void refreshBreweries(final String breweryQuery) {
        networkExecutor.execute(()->{
            breweryInteractor.getQueriedBreweries(breweryQuery);
        });
    }

    public void addBrewery(Brewery brewery){
        networkExecutor.execute(()->{
            breweryInteractor.postBrewery(brewery);
        });
    }

    public void editBrewery(Long id, Brewery brewery){
        networkExecutor.execute(()->{
            breweryInteractor.putBrewery(id, brewery);
        });
    }

    public void deleteBrewery(Long id){
        networkExecutor.execute(()->{
            breweryInteractor.delBrewery(id);
        });
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(final GetQueriedBreweriesEvent event) {
        if (event.getThrowable() != null) {
            event.getThrowable().printStackTrace();
            if (screen != null) {
                screen.showNetworkError(event.getThrowable().getMessage());
            }
        } else {
            if (screen != null) {
                screen.showBreweries(event.getBreweries());
            }
        }
    }

    public void showBrewerySearchList(String brewerySearchTerm){
        screen.showQueriedBreweries(brewerySearchTerm);
    }
}
