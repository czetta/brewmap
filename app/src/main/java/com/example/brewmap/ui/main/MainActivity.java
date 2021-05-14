package com.example.brewmap.ui.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.brewmap.BrewmapApplication;
import com.example.brewmap.R;
import com.example.brewmap.model.Brewery;
import com.example.brewmap.ui.details.DetailsActivity;
import com.google.firebase.analytics.FirebaseAnalytics;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements MainScreen {
    @Inject
    MainPresenter mainPresenter;
    private EditText etSearch;
    private List<Brewery> breweries;
    private MainAdapter mainAdapter;
    private RecyclerView recyclerViewMain;
    private FirebaseAnalytics mFirebaseAnalytics;

    public MainActivity(){
        BrewmapApplication.injector.inject(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BrewmapApplication.injector.inject(this);
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

        recyclerViewMain=findViewById(R.id.recyclerViewMain);
        etSearch=findViewById(R.id.etSearch);
        breweries=new ArrayList<>();
        mainAdapter=new MainAdapter(this, breweries);
        recyclerViewMain.setAdapter(mainAdapter);
        recyclerViewMain.setLayoutManager(new LinearLayoutManager(this));


        Button buttonSearch=findViewById(R.id.buttonSearch);
        buttonSearch.setOnClickListener((v)->{
            mainPresenter.refreshBreweries(etSearch.getText().toString());
            mainPresenter.showBrewerySearchList(etSearch.getText().toString());
        });
        ImageButton buttonDetails=findViewById(R.id.buttonDetails);
        buttonDetails.setOnClickListener((v) -> {
            Intent intent=new Intent(this, DetailsActivity.class);
            startActivity(intent);
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        mainPresenter.attachScreen(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        mainPresenter.detachScreen();
    }

    @Override
    public void showQueriedBreweries(String brewerySearchTerm) {
        mainPresenter.refreshBreweries(brewerySearchTerm);
    }

    @Override
    public void showBreweries(List<Brewery> breweries) {
        this.breweries.clear();
        this.breweries.addAll(breweries);
        mainAdapter.notifyDataSetChanged();
    }

    @Override
    public void showNetworkError(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}