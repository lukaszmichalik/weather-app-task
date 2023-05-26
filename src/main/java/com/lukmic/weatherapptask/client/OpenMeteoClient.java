package com.lukmic.weatherapptask.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "open-meteo", url = "https://archive-api.open-meteo.com/v1/archive")
public interface OpenMeteoClient {

    @GetMapping()
    ResponseEntity<?> getWeather(@RequestParam("latitude") double latitude,
                                     @RequestParam("longitude") double longitude,
                                     @RequestParam("start_date") String startDate,
                                     @RequestParam("end_date") String endDate,
                                     @RequestParam("daily") String daily,
                                     @RequestParam("timezone") String timezone);
}
