package com.example.openweatherapiapp;

import com.example.openweatherapiapp.controller.WeatherController;
import com.example.openweatherapiapp.service.WeatherService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringOpenWeatherApiAppApplication implements CommandLineRunner {

    private final WeatherController controller;

    public SpringOpenWeatherApiAppApplication(WeatherService weatherService) {
        controller = new WeatherController(weatherService);
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringOpenWeatherApiAppApplication.class, args);
    }
    @Override
    public void run(String...args) throws Exception {
        controller.start();
    }

}
