package com.houstoncounty.repair;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloWorld {

    @Autowired
    private WeatherRepo weatherRepo;

    @GetMapping("/weather")
    public List<Weather> getWeather() {
        return weatherRepo.getWeather();
    }
}
