package com.ujjwalsharma.project.uber.uberApp.Strategies;

import com.ujjwalsharma.project.uber.uberApp.dto.RideRequestDto;
import com.ujjwalsharma.project.uber.uberApp.entities.Driver;

import java.util.List;

public interface DriverMatchingStrategy {
    List<Driver> findMatchingDriver(RideRequestDto rideRequestDto);
}
