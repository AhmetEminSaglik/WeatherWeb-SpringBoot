package com.example.ahmeteminsaglik.weatherapp;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service // bunu yazdiktan sonra api'ye gidince Http Requestleri calisiyor
public class WeatherService {

}
