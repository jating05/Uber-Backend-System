package com.ujjwalsharma.project.uber.uberApp.dto;

import com.ujjwalsharma.project.uber.uberApp.entities.Driver;
import com.ujjwalsharma.project.uber.uberApp.entities.Rider;
import com.ujjwalsharma.project.uber.uberApp.entities.enums.PaymentMethod;
import com.ujjwalsharma.project.uber.uberApp.entities.enums.RideStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RideRequestDto {
    private Long id;
    private Point pickupLocation;

    private Point dropoffLocation;
    private LocalDateTime createdTime;

    private RiderDto rider;
    private Driver driver;

    private PaymentMethod paymentMethod;
    private RideStatus rideStatus;

}
