package com.example.openweatherapiapp.service;


import com.example.openweatherapiapp.domain.CityName;

import java.util.Optional;

public interface WeatherService {
    void FindWeatherByCityName(CityName cityName);
    Optional<CityName> findByName(String city);

}
