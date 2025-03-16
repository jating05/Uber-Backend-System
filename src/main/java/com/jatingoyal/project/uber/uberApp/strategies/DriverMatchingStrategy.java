package com.jatingoyal.project.uber.uberApp.strategies;

import com.jatingoyal.project.uber.uberApp.entities.Driver;
import com.jatingoyal.project.uber.uberApp.entities.RideRequest;

import java.util.List;

public interface DriverMatchingStrategy {

    List<Driver> findMatchingDriver(RideRequest rideRequest);
}
