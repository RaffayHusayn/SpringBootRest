package com.fclass.springbootrest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class WeatherResource {

    @RequestMapping("cities")
    public List<Weather> getWeather(){
        List<Weather> cities = new ArrayList<>();
        Weather ny = new Weather();
        ny.setCity("new york");
        ny.setTemp(44);
        ny.setPrecipitation("moderate");

        Weather la = new Weather();
        la.setCity("la");
        la.setTemp(104);
        la.setPrecipitation("low");

        cities.add(ny);
        cities.add(la);

        return cities;
    }
}
