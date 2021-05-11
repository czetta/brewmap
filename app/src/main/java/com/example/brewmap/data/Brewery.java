package com.example.brewmap.data;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Brewery {
  @PrimaryKey(autoGenerate = true)
  public Long id;
  @ColumnInfo(name="name")
  public String name;
  @ColumnInfo(name="brewery_type")
  public String brewery_type;
  @ColumnInfo(name="street")
  public String street;
  @ColumnInfo(name="address_2")
  public String address_2;
  @ColumnInfo(name="address_3")
  public String address_3;
  @ColumnInfo(name="city")
  public String city;
  @ColumnInfo(name="county_province")
  public String county_province;
  @ColumnInfo(name="state")
  public String state;
  @ColumnInfo(name="postal_code")
  public String postal_code;
  @ColumnInfo(name="country")
  public String country;
  @ColumnInfo(name="longitude")
  public String longitude;
  @ColumnInfo(name="latitude")
  public String latitude;
  @ColumnInfo(name="phone")
  public String phone;
  @ColumnInfo(name="website_url")
  public String website_url;
  @ColumnInfo(name="updated_at")
  public String updated_at;
  @ColumnInfo(name="created_at")
  public String created_at;
}
