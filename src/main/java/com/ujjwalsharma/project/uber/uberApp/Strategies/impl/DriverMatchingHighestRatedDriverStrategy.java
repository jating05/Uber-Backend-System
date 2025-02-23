package com.ujjwalsharma.project.uber.uberApp.Strategies.impl;

import com.ujjwalsharma.project.uber.uberApp.Strategies.DriverMatchingStrategy;
import com.ujjwalsharma.project.uber.uberApp.dto.RideRequestDto;
import com.ujjwalsharma.project.uber.uberApp.entities.Driver;

import java.util.List;

public class DriverMatchingHighestRatedDriverStrategy implements DriverMatchingStrategy {

    @Override
    public List<Driver> findMatchingDriver(RideRequestDto rideRequestDto){
        return List.of();
    }

}
