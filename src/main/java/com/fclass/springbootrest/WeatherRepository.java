package com.fclass.springbootrest;

import org.springframework.data.repository.CrudRepository;

public interface WeatherRepository extends CrudRepository<City, String> {
}
