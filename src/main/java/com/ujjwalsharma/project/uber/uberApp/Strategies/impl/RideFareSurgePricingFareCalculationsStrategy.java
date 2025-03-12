package com.jatingoyal.project.uber.uberApp.Strategies.impl;

import com.jatingoyal.project.uber.uberApp.Strategies.RideFareCalculationStrategy;
import com.jatingoyal.project.uber.uberApp.dto.RideRequestDto;

public class RideFareSurgePricingFareCalculationsStrategy implements RideFareCalculationStrategy{
    @Override
    public double calculateFare(RideRequestDto rideRequestDto){
        return 0;
    }
}
