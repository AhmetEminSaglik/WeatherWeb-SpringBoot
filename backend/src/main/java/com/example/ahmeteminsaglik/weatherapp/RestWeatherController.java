package com.example.ahmeteminsaglik.weatherapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping()
public class RestWeatherController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{city}")
    @ResponseBody
    public String getWeather(@PathVariable String city) {
        String url = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=061cbcfa6b576b717e5260eeb02ecc0e";
        String response = restTemplate.getForObject(url, String.class);
        return response;
    }


}
