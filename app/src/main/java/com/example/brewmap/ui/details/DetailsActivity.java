package com.example.brewmap.ui.details;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.brewmap.BrewmapApplication;
import com.example.brewmap.R;

import javax.inject.Inject;

public class DetailsActivity extends AppCompatActivity implements DetailsScreen {
    @Inject
    DetailsPresenter detailsPresenter;

    public DetailsActivity(){
        BrewmapApplication.injector.inject(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        BrewmapApplication.injector.inject(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        detailsPresenter.attachScreen(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        detailsPresenter.detachScreen();
    }
}
