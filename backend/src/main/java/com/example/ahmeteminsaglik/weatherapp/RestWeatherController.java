package com.example.ahmeteminsaglik.weatherapp;

import com.example.ahmeteminsaglik.weatherapp.Entity.WeatherDataInfo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

@Controller
@RequestMapping()

public class RestWeatherController {
    @Autowired
    private RestTemplate restTemplate;

    /*@GetMapping("/{city}")
    @ResponseBody
    public WeatherDataInfo getWeather(@PathVariable String city) {
        String url = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=061cbcfa6b576b717e5260eeb02ecc0e";
        String response = restTemplate.getForObject(url, String.class);
        WeatherDataInfo weatherDataInfo = convertJsonIValueToJavaObject(response);
        weatherDataInfo.setCity(city);
        System.out.println("Nesneye aktarilan WeatherDataInfo degerler : " + weatherDataInfo.toString());

        return weatherDataInfo;

    }

    private WeatherDataInfo convertJsonIValueToJavaObject(String jsonValues) {
        WeatherDataInfo weatherDataInfo = null;
        System.out.println(" GELEN JSON DEGERLERI : "+jsonValues);
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            weatherDataInfo = objectMapper.readValue(jsonValues, WeatherDataInfo.class);

            return weatherDataInfo;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }*/

    @GetMapping("/{city}")
    @ResponseBody
    public String getWeather(@PathVariable String city) {
        String url = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=061cbcfa6b576b717e5260eeb02ecc0e";
        String response = restTemplate.getForObject(url, String.class);
/*        char[] charResponse = response.toCharArray();
        String refactorText = "";
        for (int i = 0; i < charResponse.length - 2; i++) {
            refactorText += charResponse[i];
        }
        refactorText+= ",\"city\":\""+city+"\"}";*/


        System.out.println("SSSSSSSSSSSSSS " + response.charAt(response.length() - 1));

        System.out.println("response : " + response);
//        WeatherDataInfo weatherDataInfo = convertJsonIValueToJavaObject(response);
//        weatherDataInfo.setCity(city);
//        System.out.println("Nesneye aktarilan WeatherDataInfo degerler : " + weatherDataInfo.toString());

        return response;

    }

    private WeatherDataInfo convertJsonIValueToJavaObject(String jsonValues) {
        WeatherDataInfo weatherDataInfo = null;
        System.out.println(" GELEN JSON DEGERLERI : " + jsonValues);
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            weatherDataInfo = objectMapper.readValue(jsonValues, WeatherDataInfo.class);

            return weatherDataInfo;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }



  /*  //    static int counter = 0;
    String requestedCity = null;
//    Thread weatherThread;
//    static boolean killThread;

    static int counter = 0;
    boolean cityChanged = false;

    @GetMapping("/{city}")
    @ResponseBody
    public String getWeather(@PathVariable String city) {
        checkEnteredCityChanged(city);
        Runnable runnable = createRunnable(city);
        int periodicTime = 1;
        getWeatherDataPeriodicTime(runnable, periodicTime);
        return "Bos ddeger gonderiyozu " + counter;
    }

    private void checkEnteredCityChanged(String enteredCity) {
        if (requestedCity != null && enteredCity != requestedCity) {
            cityChanged = true;
        }
    }

    ScheduledExecutorService executor = null;

    public void getWeatherDataPeriodicTime(Runnable runnableWeatherDataBring, int time) {
        if (cityChanged == true) {
            ScheduledFuture<?> scheduledFuture =
                    executor.scheduleAtFixedRate(, 1L, 1L, TimeUnit.SECONDS);

        }
        executor = Executors.newScheduledThreadPool(1);
        executor.scheduleAtFixedRate(runnableWeatherDataBring, 0, time, TimeUnit.SECONDS);

    }

    private Runnable createRunnable(String city) {
        Runnable runnable = new Runnable() {
            public void run() {
                bringWeatherDataGivenCity(city);
                counter++;
                System.out.println("run a girid");
            }
        };
        return runnable;

    }

    @ResponseBody
    private String bringWeatherDataGivenCity(String city) {
        String urlString = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=061cbcfa6b576b717e5260eeb02ecc0e";
        try {
            URL url = new URL(urlString);
//            ObjectMapper objectMapper = new ObjectMapper();
//            WeatherDataInfo weatherDataInfo = objectMapper.readValue(url, WeatherDataInfo.class);

            String response = restTemplate.getForObject(url.toString(), String.class);

            WeatherDataInfo weatherDataInfo = convertJsonIValueToJavaObject(response);

//            getWeatherDataPeriodicTime();

            return response;
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return "Unknow city entered.";
    }*/


}
