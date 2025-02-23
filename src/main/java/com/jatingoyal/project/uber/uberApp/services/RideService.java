package com.jatingoyal.project.uber.uberApp.services;

import com.jatingoyal.project.uber.uberApp.dto.RideRequestDto;
import com.jatingoyal.project.uber.uberApp.entities.Driver;
import com.jatingoyal.project.uber.uberApp.entities.Ride;
import com.jatingoyal.project.uber.uberApp.entities.enums.RideStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface RideService {

    Ride getRideById(Long rideId);

    void matchWithDrivers(RideRequestDto rideRequestDto); //it would not return anything only match with drivers

    Ride createNewRide(RideRequestDto rideRequestDto, Driver driver);

    Ride updateRideStatus(Long rideId, RideStatus rideStatus);

    Page<Ride> getAllRidesOfRider(Long riderId, PageRequest pageRequest);

    Page<Ride> getAllRidesOfDriver(Long driverId, PageRequest pageRequest);

}
