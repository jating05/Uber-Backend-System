package com.ujjwalsharma.project.uber.uberApp.Strategies;

import com.ujjwalsharma.project.uber.uberApp.dto.RideRequestDto;

public interface RideFareCalculationStrategy {
    double calculateFare(RideRequestDto rideRequestDto);
}
