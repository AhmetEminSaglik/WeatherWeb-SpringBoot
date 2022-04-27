package com.example.ahmeteminsaglik.weatherapp.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@Data
public class WeatherDataInfo  {
//    String city = "";


    Coord coord = new Coord();
    Weather weather = new Weather();
    Clouds clouds = new Clouds();
    Main main = new Main();
    Wind wind = new Wind();
    Sys sys = new Sys();
    Root root = new Root();

    @Data
    public class Coord {

        public double lon;
        public double lat;

        @Override
        public String toString() {
            return "Coord{" +
                    "lon=" + lon +
                    ", lat=" + lat +
                    '}';
        }
    }

    @Data
    public class Weather {
        public int id;
        public String main;
        public String description;
        public String icon;

        @Override
        public String toString() {
            return "Weather{" +
                    "id=" + id +
                    ", main='" + main + '\'' +
                    ", description='" + description + '\'' +
                    ", icon='" + icon + '\'' +
                    '}';
        }
    }

    @Data
    public class Clouds {
        public int all;

        @Override
        public String toString() {
            return "Clouds{" +
                    "all=" + all +
                    '}';
        }
    }

    @Data
    public class Wind {
        public double speed;
        public int deg;
        public double gust;

        @Override
        public String toString() {
            return "Wind{" +
                    "speed=" + speed +
                    ", deg=" + deg +
                    ", gust=" + gust +
                    '}';
        }
    }

    @Data
    public class Sys {
        public int type;
        public int id;
        public String country;
        public int sunrise;
        public int sunset;

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> COUNTRY  SET EDILDI");
        }

        public int getSunrise() {
            return sunrise;
        }

        public void setSunrise(int sunrise) {
            this.sunrise = sunrise;
        }

        public int getSunset() {
            return sunset;
        }

        public void setSunset(int sunset) {
            this.sunset = sunset;
        }

        @Override
        public String toString() {
            return "Sys{" +
                    "type=" + type +
                    ", id=" + id +
                    ", country='" + country + '\'' +
                    ", sunrise=" + sunrise +
                    ", sunset=" + sunset +
                    '}';
        }
    }

    @Data
    public class Main {
        public double temp;
        public double feels_like;
        public double temp_min;
        public double temp_max;
        public int pressure;
        public int humidity;

        @Override
        public String toString() {
            return "Main{" +
                    "temp=" + temp +
                    ", feels_like=" + feels_like +
                    ", temp_min=" + temp_min +
                    ", temp_max=" + temp_max +
                    ", pressure=" + pressure +
                    ", humidity=" + humidity +
                    '}';
        }
    }


    @Data
    public class Root {
        public Coord coord;
        public ArrayList<Weather> weather;
        public String base;
        public Main main;
        public int visibility;
        public Wind wind;
        public Clouds clouds;
        public int dt;
        public Sys sys;
        public int timezone;
        public int id;
        public String name;
        public int cod;

        @Override
        public String toString() {
            return "Root{" +
                    "coord=" + coord +
                    ", weather=" + weather +
                    ", base='" + base + '\'' +
                    ", main=" + main +
                    ", visibility=" + visibility +
                    ", wind=" + wind +
                    ", clouds=" + clouds +
                    ", dt=" + dt +
                    ", sys=" + sys +
                    ", timezone=" + timezone +
                    ", id=" + id +
                    ", name='" + name + '\'' +
                    ", cod=" + cod +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "WeatherDataInfo{" +
//                "city='" + city + '\'' +
                ", coord=" + coord.toString() +
                ", weather=" + weather.toString() +
                ", main=" + main.toString() +
                ", wind=" + wind.toString() +
                ", clouds=" + clouds.toString() +
                ", sys=" + sys.toString() +
                ", root=" + root.toString() +
                '}';
    }
}

