package com.example.openweatherapiapp.service;


import com.example.openweatherapiapp.domain.CityName;

public interface WeatherService {
    void FindWeatherByCityName(CityName cityName);

}
