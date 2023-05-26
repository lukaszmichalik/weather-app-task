package com.lukmic.weatherapptask.payload.request;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;

public class WeatherRequest {

    @DecimalMin(value = "-90.0", inclusive = true, message = "Latitude must be greater than or equal to -90.0")
    @DecimalMax(value = "90.0", inclusive = true, message = "Latitude must be less than or equal to 90.0")
    private double latitude;
    @DecimalMin(value = "-180.0", inclusive = true, message = "Longitude must be greater than or equal to -180.0")
    @DecimalMax(value = "180.0", inclusive = true, message = "Longitude must be less than or equal to 180.0")
    private double longitude;

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
