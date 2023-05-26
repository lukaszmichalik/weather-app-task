package com.lukmic.weatherapptask.service;

import com.lukmic.weatherapptask.client.OpenMeteoClient;
import com.lukmic.weatherapptask.model.Request;
import com.lukmic.weatherapptask.payload.request.WeatherRequest;
import com.lukmic.weatherapptask.repository.RequestRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
@Service
public class RequestService {

    private final RequestRepository requestRepository;
    private final OpenMeteoClient openMeteoClient;

    public RequestService(RequestRepository requestRepository, OpenMeteoClient openMeteoClient) {
        this.requestRepository = requestRepository;
        this.openMeteoClient = openMeteoClient;
    }

    public ResponseEntity<?> getWeather(WeatherRequest weatherRequest) {

        LocalDateTime time = LocalDateTime.now();
        Request request = new Request(weatherRequest.getLatitude(), weatherRequest.getLongitude(), time);
        requestRepository.save(request);

        LocalDate startDate = LocalDate.now().minusWeeks(1)
                .with(DayOfWeek.MONDAY);
        LocalDate endDate = LocalDate.now().minusWeeks(1)
                .with(DayOfWeek.SUNDAY);

        return ResponseEntity.ok(openMeteoClient.getWeather(weatherRequest.getLatitude(),
                weatherRequest.getLongitude(),
                startDate.toString(),
                endDate.toString(),
                "sunrise,sunset,precipitation_sum",
                "auto").getBody());
    }
}
