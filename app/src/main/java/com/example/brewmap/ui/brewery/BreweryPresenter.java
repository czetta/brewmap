package com.example.brewmap.ui.brewery;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import com.example.brewmap.di.Network;
import com.example.brewmap.interactor.brewery.BreweryInteractor;
import com.example.brewmap.interactor.brewery.event.GetBreweryEvent;
import com.example.brewmap.ui.Presenter;

import java.util.concurrent.Executor;

import javax.inject.Inject;

public class BreweryPresenter extends Presenter<BreweryScreen> {
    Executor networkExecutor;
    BreweryInteractor breweryInteractor;

    @Inject
    public BreweryPresenter(@Network Executor networkExecutor, BreweryInteractor breweryInteractor){
        this.networkExecutor=networkExecutor;
        this.breweryInteractor=breweryInteractor;
    }

    @Override
    public void attachScreen(BreweryScreen screen){
        super.attachScreen(screen);
        EventBus.getDefault().register(this);
    }

    @Override
    public void detachScreen(){
        EventBus.getDefault().unregister(this);
        super.detachScreen();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(final GetBreweryEvent event){

    }
}
