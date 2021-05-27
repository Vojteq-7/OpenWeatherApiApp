package com.example.openweatherapiapp.controller;

import com.example.openweatherapiapp.service.WeatherService;
import com.example.openweatherapiapp.view.core.ConsoleLooper;
import com.example.openweatherapiapp.view.core.ConsoleView;

import java.awt.*;
import java.util.Map;
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

