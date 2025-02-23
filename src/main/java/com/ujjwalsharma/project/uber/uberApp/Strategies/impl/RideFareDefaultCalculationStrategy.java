package com.ujjwalsharma.project.uber.uberApp.Strategies.impl;

import com.ujjwalsharma.project.uber.uberApp.Strategies.RideFareCalculationStrategy;
import com.ujjwalsharma.project.uber.uberApp.dto.RideRequestDto;

public class RideFareDefaultCalculationStrategy implements RideFareCalculationStrategy {

    @Override
    public double calculateFare(RideRequestDto rideRequestDto){
        return 0;
    }
}
