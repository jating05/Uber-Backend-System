package com.jatingoyal.project.uber.uberApp.Strategies;

import com.jatingoyal.project.uber.uberApp.dto.RideRequestDto;

public interface RideFareCalculationStrategy {
    double calculateFare(RideRequestDto rideRequestDto);
}
