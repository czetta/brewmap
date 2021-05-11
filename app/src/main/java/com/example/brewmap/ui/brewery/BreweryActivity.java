package com.example.brewmap.ui.brewery;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.brewmap.BrewmapApplication;
import com.example.brewmap.R;
import com.example.brewmap.model.Brewery;

import javax.inject.Inject;

public class BreweryActivity extends AppCompatActivity implements BreweryScreen {
    @Inject
    BreweryPresenter breweryPresenter;
    private TextView tvBreweryName;
    private TextView tvAddress;
    private TextView tvPhone;
    private TextView tvWeb;
    private Brewery brewery;

    public BreweryActivity(){
        BrewmapApplication.injector.inject(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brewery);
        BrewmapApplication.injector.inject(this);
        brewery=(Brewery)getIntent().getSerializableExtra("brewery");
        tvBreweryName=findViewById(R.id.tvBreweryName);
        tvAddress=findViewById(R.id.tvAddress);
        tvPhone=findViewById(R.id.tvPhone);
        tvWeb=findViewById(R.id.tvWeb);
        tvBreweryName.setText(brewery.getName());
        tvAddress.setText(brewery.getStreet()+", "+brewery.getCity());
        tvPhone.setText(brewery.getPhone());
        tvWeb.setText(brewery.getWebsiteUrl());
    }

    @Override
    protected void onStart() {
        super.onStart();
        breweryPresenter.attachScreen(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        breweryPresenter.detachScreen();
    }
}
