package com.example.openweatherapiapp.view.domain;

import java.util.Scanner;

public class GetCityNameFromConsole {
    private final Scanner scanner;

    public GetCityNameFromConsole(Scanner scanner) {
        this.scanner = scanner;
    }
    public String AsForNameCity() {
        System.out.println("Wpisz nazwę miejscowości: ");
        return scanner.nextLine();
    }
}
