package com.example.brewmap.data;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.brewmap.model.Brewery;

@Database(entities = {Brewery.class}, version=1)
public abstract class AppDatabase extends RoomDatabase {
  public abstract BreweryDao breweryDao();
}
