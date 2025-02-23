package com.ujjwalsharma.project.uber.uberApp.Strategies.impl;

import com.ujjwalsharma.project.uber.uberApp.Strategies.DriverMatchingStrategy;
import com.ujjwalsharma.project.uber.uberApp.dto.RideRequestDto;
import com.ujjwalsharma.project.uber.uberApp.entities.Driver;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverMatchingNearestDriverStrategy implements DriverMatchingStrategy {

     @Override
    public List<Driver> findMatchingDriver(RideRequestDto rideRequestDto){
         return List.of();
     }
}
