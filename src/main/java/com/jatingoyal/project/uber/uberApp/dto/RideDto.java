package com.jatingoyal.project.uber.uberApp.dto;

import com.jatingoyal.project.uber.uberApp.entities.enums.PaymentMethod;
import com.jatingoyal.project.uber.uberApp.entities.enums.RideStatus;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

public class RideDto {
    private Long id;
    private Point pickupLocation;

    private Point dropoffLocation;
    private LocalDateTime createdTime;

    private RiderDto rider;
    private DriverDto driver;

    private PaymentMethod paymentMethod;
    private RideStatus rideStatus;

    private Double fare;
    private LocalDateTime startedAt;
    private LocalDateTime endedAt;
}
