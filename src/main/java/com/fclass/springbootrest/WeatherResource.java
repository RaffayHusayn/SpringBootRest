package com.fclass.springbootrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class WeatherResource {

    @Autowired
    WeatherRepository repo;
    @RequestMapping("cities")
    public List<City> getWeather(){
        List<City> cities =(List<City>)repo.findAll();
        return cities;
    }


    @RequestMapping("city/{name}")
    public Optional<City> getWeather(@PathVariable String name){
        Optional<City> city =repo.findById(name);
        return city;
    }
}
