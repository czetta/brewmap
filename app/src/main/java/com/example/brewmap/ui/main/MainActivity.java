package com.example.brewmap.ui.main;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.brewmap.R;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}