package com.lukmic.weatherapptask.controller;

import com.lukmic.weatherapptask.payload.request.WeatherRequest;
import com.lukmic.weatherapptask.service.RequestService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/requests")
public class RequestController {

    private final RequestService requestService;

    public RequestController(RequestService requestService) {
        this.requestService = requestService;
    }

    @PostMapping
    public ResponseEntity<?> getWeather(@Valid @RequestBody WeatherRequest weatherRequest) {
        return requestService.getWeather(weatherRequest);
    }
}
