package com.ujjwalsharma.project.uber.uberApp.services;

import com.ujjwalsharma.project.uber.uberApp.dto.DriverDto;
import com.ujjwalsharma.project.uber.uberApp.dto.RideDto;

import java.util.List;

public interface DriverService {

    RideDto acceptRide(Long rideId);

    RideDto cancelRide(Long rideId);

    RideDto startRide(Long rideId);

    RideDto endRide(Long rideId);

    RideDto rateRider(Long rideId, Integer rating);

    DriverDto grtMyProfile();

    List<RideDto> getAllMyRides();
}
