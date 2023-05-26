package com.lukmic.weatherapptask.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "requests")
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double latitude;
    private double longitude;
    private LocalDateTime time;

    public Request(double latitude, double longitude, LocalDateTime time) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.time = time;
    }

    public Request() {}
}
