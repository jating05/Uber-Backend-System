package com.jatingoyal.project.uber.uberApp.services;

import com.jatingoyal.project.uber.uberApp.entities.RideRequest;

public interface RideRequestService {

    RideRequest findRideRequestById(Long rideRequestId);

    void update(RideRequest rideRequest);
}
