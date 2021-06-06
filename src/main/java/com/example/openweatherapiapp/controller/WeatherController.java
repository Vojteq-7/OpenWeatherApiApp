package com.example.openweatherapiapp.controller;

import com.example.openweatherapiapp.domain.CityName;
import com.example.openweatherapiapp.service.WeatherService;
import com.example.openweatherapiapp.service.WeatherServiceApi;
import com.example.openweatherapiapp.view.core.ConsoleLooper;
import com.example.openweatherapiapp.view.core.ConsoleView;
import com.example.openweatherapiapp.view.core.Menu;
import com.example.openweatherapiapp.view.core.MenuItem;
import com.example.openweatherapiapp.view.domain.GetCityNameFromConsole;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;


public class WeatherController {
    private final ConsoleLooper looper;
    private final ConsoleView view;
    private final Scanner input = new Scanner(System.in);

    public WeatherController(WeatherService weatherService) {
        Menu menu = new Menu();
        view = new ConsoleView(menu, System.in);
        looper = new ConsoleLooper(view);

        menu.addMenuItem(new MenuItem(
                "Wyszukaj pogodę dla miasta.",
                () -> {
                    GetCityNameFromConsole cityGet = new GetCityNameFromConsole(input);
                    String city = cityGet.AsForNameCity();
                    weatherService.findByName(city);

                }
        ));
        menu.addMenuItem(new MenuItem(
                "Koniec",
                Menu.DEFAULT_QUIT
        ));
    }

    public void start() {
        looper.runLoop();
    }
}

