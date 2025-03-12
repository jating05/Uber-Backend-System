package com.jatingoyal.project.uber.uberApp.Strategies.impl;

import com.jatingoyal.project.uber.uberApp.Strategies.DriverMatchingStrategy;
import com.jatingoyal.project.uber.uberApp.dto.RideRequestDto;
import com.jatingoyal.project.uber.uberApp.entities.Driver;

import java.util.List;

public class DriverMatchingHighestRatedDriverStrategy implements DriverMatchingStrategy {

    @Override
    public List<Driver> findMatchingDriver(RideRequestDto rideRequestDto){
        return List.of();
    }

}
