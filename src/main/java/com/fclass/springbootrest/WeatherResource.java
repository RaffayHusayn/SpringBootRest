package com.fclass.springbootrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WeatherResource {

    @Autowired
    WeatherRepository repo;
    @RequestMapping("cities")
    public List<City> getWeather(){
        List<City> cities =(List<City>)repo.findAll();
//        Weather ny = new Weather();
//        ny.setCity("new york");
//        ny.setTemp(44);
//        ny.setPrecipitation("moderate");
//
//        Weather la = new Weather();
//        la.setCity("la");
//        la.setTemp(104);
//        la.setPrecipitation("low");
//
//        cities.add(ny);
//        cities.add(la);

        return cities;
    }
}
