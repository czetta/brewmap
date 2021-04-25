package com.example.brewmap.data;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface BreweryDao {
    @Query("SELECT * FROM brewery")
    List<Brewery> getAll();

    @Query("SELECT * FROM brewery WHERE id = :id")
    Brewery findById(Long id);

    @Query("SELECT * FROM brewery WHERE name LIKE :queue")
    List<Brewery> findByName(String queue);

    @Insert
    void insertBrewery(Brewery brewery);

    @Update
    void updateBrewery(Brewery brewery);

    @Delete
    void delete(Brewery brewery);
}
