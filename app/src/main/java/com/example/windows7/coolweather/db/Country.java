package com.example.windows7.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by windows7 on 2018/3/23.
 */

public class Country extends DataSupport {
    private int id;
    private String countryName;
    private int cityId;
    private String weatherId;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getCityId(){
        return cityId;
    }
    public void setCityId(int cityId){
        this.cityId = cityId;
    }
    public String getCountryName(){
        return countryName;
    }
    public void setCountryName(String countryName){
        this.countryName = countryName;
    }
    public String getWeatherId(){
        return weatherId;
    }
    public void setWeatherId(String weatherId){
       this.weatherId = weatherId;
    }
}
