package com.example.openweatherapiapp.service;

import com.example.openweatherapiapp.domain.CityName;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class WeatherServiceApi implements WeatherService{
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {

        URI uri = new URI("http://api.openweathermap.org/data/2.5/weather?q={city}&appid=fd071cbcdf68906fb0cfc616df57cfd1&units=metric&lang=pl"),
                city;
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(uri)
                .build();
        HttpClient client = HttpClient.newHttpClient();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }


    @Override
    public void FindWeatherByCityName(CityName cityName) {

    }

    @Override
    public Optional<CityName> findByName(String city) {
        return Optional.empty();
    }

}
