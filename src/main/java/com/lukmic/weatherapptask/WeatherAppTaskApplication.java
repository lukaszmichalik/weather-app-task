package com.lukmic.weatherapptask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class WeatherAppTaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeatherAppTaskApplication.class, args);
    }

}
