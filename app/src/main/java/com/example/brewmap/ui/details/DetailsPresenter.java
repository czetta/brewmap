package com.example.brewmap.ui.details;

import com.example.brewmap.ui.Presenter;

import org.greenrobot.eventbus.EventBus;

import javax.inject.Inject;

public class DetailsPresenter extends Presenter<DetailsScreen> {

    @Inject
    public DetailsPresenter(){}

    @Override
    public void attachScreen(DetailsScreen screen) {
        super.attachScreen(screen);
    }

    @Override
    public void detachScreen() {
        super.detachScreen();
    }
}
