package com.example.ahmeteminsaglik.weatherapp.service;

import com.example.ahmeteminsaglik.weatherapp.Entity.WeatherDataInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import java.net.http.HttpHeaders;

public class ApiServiceImp implements ApiService {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private HttpHeaders httpHeaders;
    static String city = "Ankara";
    private static String url = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=061cbcfa6b576b717e5260eeb02ecc0e";

    @Override
    public WeatherDataInfo getWeather() {
//        httpHeaders.setAccept(List.of(MediaType.APPLICATION_JSON));
//        HttpEntity<String > entity= new HttpEntity<>(httpHeaders);
//        restTemplate.exchange(url, HttpMethod.GET);
        return null;
    }
}
