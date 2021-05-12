package com.example.brewmap.ui.main;

import com.example.brewmap.model.Brewery;

import java.util.List;

public interface MainScreen {
  void showQueriedBreweries(String brewerySearchTerm);

  void showBreweries(List<Brewery> breweries);

  void showNetworkError(String message);
}
