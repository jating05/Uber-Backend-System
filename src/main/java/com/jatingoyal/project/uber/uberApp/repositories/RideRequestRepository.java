package com.jatingoyal.project.uber.uberApp.repositories;

import com.jatingoyal.project.uber.uberApp.entities.RideRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RideRequestRepository extends JpaRepository<RideRequest, Long> {
//    TODO: Custom Query


}
