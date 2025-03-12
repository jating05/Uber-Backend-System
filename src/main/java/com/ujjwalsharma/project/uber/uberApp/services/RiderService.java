package com.jatingoyal.project.uber.uberApp.services;

import com.jatingoyal.project.uber.uberApp.dto.DriverDto;
import com.jatingoyal.project.uber.uberApp.dto.RideDto;
import com.jatingoyal.project.uber.uberApp.dto.RideRequestDto;
import com.jatingoyal.project.uber.uberApp.dto.RiderDto;

import java.util.List;

public interface RiderService {
    RideRequestDto requestRide(RideRequestDto rideRequestDto);

    RideDto cancelRide(Long rideId);

    DriverDto rateDriver(Long rideId, Integer rating);

    RiderDto grtMyProfile();

    List<RideDto> getAllMyRides();

}
