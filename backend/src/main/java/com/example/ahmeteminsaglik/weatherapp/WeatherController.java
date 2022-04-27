/*
package com.example.ahmeteminsaglik.weatherapp;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class WeatherController {

    String city = "Ankara";
    String url = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=061cbcfa6b576b717e5260eeb02ecc0e";
    private WeatherService weatherService;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping
    public ResponseEntity<List<Result>> getWeather() {
        System.out.println("geldi");
        Object result = restTemplate.getForEntity(url, ResponseEntity.class);
        System.out.println("---------- 1");
        System.out.println(result);
        return null;
    }


//    private final String url = "";

 */
/*   @Autowired
    private RestTemplate restTemplate;

    private WeatherService weatherService;

    @GetMapping()
    public void getWeatherByCityName(String city) {
        city="ankara";
        String url = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=061cbcfa6b576b717e5260eeb02ecc0e";
        HttpHeaders headers= new HttpHeaders();
        System.out.println("--------------------------- 1 ");
        Object[] objects = restTemplate.getForObject(url, Object[].class);
        System.out.println("--------------------------- 2 ");
        for (Object tmp : objects) {
            System.out.println(tmp);
        }
//        List<Object> weatherDataList = Arrays.asList(objects);
//        weatherDataList.forEach(()-> System.out.println());

//        return weatherService.


    }*//*

}
*/
