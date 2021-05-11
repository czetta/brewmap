package com.example.brewmap.model;

import android.os.Build;

import androidx.annotation.RequiresApi;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

@Entity
public class Brewery implements Serializable {

  @PrimaryKey
  @SerializedName("id")
  private Long id = null;
  
  @SerializedName("name")
  private String name = null;
  
  @SerializedName("brewery_type")
  private String breweryType = null;
  
  @SerializedName("street")
  private String street = null;
  
  @SerializedName("address_2")
  private String address2 = null;
  
  @SerializedName("address_3")
  private String address3 = null;
  
  @SerializedName("city")
  private String city = null;
  
  @SerializedName("county_province")
  private String countyProvince = null;
  
  @SerializedName("state")
  private String state = null;
  
  @SerializedName("postal_code")
  private String postalCode = null;
  
  @SerializedName("country")
  private String country = null;
  
  @SerializedName("longitude")
  private String longitude = null;
  
  @SerializedName("latitude")
  private String latitude = null;
  
  @SerializedName("phone")
  private String phone = null;
  
  @SerializedName("website_url")
  private String websiteUrl = null;
  
  @SerializedName("updated_at")
  private String updatedAt = null;
  
  @SerializedName("created_at")
  private String createdAt = null;
  

  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public String getBreweryType() {
    return breweryType;
  }
  public void setBreweryType(String breweryType) {
    this.breweryType = breweryType;
  }

  public String getStreet() {
    return street;
  }
  public void setStreet(String street) {
    this.street = street;
  }

  public String getAddress2() {
    return address2;
  }
  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  public String getAddress3() {
    return address3;
  }
  public void setAddress3(String address3) {
    this.address3 = address3;
  }

  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }

  public String getCountyProvince() {
    return countyProvince;
  }
  public void setCountyProvince(String countyProvince) {
    this.countyProvince = countyProvince;
  }

  public String getState() {
    return state;
  }
  public void setState(String state) {
    this.state = state;
  }

  public String getPostalCode() {
    return postalCode;
  }
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }

  public String getLongitude() {
    return longitude;
  }
  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }

  public String getLatitude() {
    return latitude;
  }
  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getWebsiteUrl() {
    return websiteUrl;
  }
  public void setWebsiteUrl(String websiteUrl) {
    this.websiteUrl = websiteUrl;
  }

  public String getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public String getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  

  @RequiresApi(api = Build.VERSION_CODES.KITKAT)
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Brewery brewery = (Brewery) o;
    return Objects.equals(id, brewery.id) &&
        Objects.equals(name, brewery.name) &&
        Objects.equals(breweryType, brewery.breweryType) &&
        Objects.equals(street, brewery.street) &&
        Objects.equals(address2, brewery.address2) &&
        Objects.equals(address3, brewery.address3) &&
        Objects.equals(city, brewery.city) &&
        Objects.equals(countyProvince, brewery.countyProvince) &&
        Objects.equals(state, brewery.state) &&
        Objects.equals(postalCode, brewery.postalCode) &&
        Objects.equals(country, brewery.country) &&
        Objects.equals(longitude, brewery.longitude) &&
        Objects.equals(latitude, brewery.latitude) &&
        Objects.equals(phone, brewery.phone) &&
        Objects.equals(websiteUrl, brewery.websiteUrl) &&
        Objects.equals(updatedAt, brewery.updatedAt) &&
        Objects.equals(createdAt, brewery.createdAt);
  }

  @RequiresApi(api = Build.VERSION_CODES.KITKAT)
  @Override
  public int hashCode() {
    return Objects.hash(id, name, breweryType, street, address2, address3, city, countyProvince, state, postalCode, country, longitude, latitude, phone, websiteUrl, updatedAt, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Brewery {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    breweryType: ").append(toIndentedString(breweryType)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    address3: ").append(toIndentedString(address3)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    countyProvince: ").append(toIndentedString(countyProvince)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    websiteUrl: ").append(toIndentedString(websiteUrl)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
