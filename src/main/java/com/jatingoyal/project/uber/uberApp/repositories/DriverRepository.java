package com.jatingoyal.project.uber.uberApp.repositories;

import com.jatingoyal.project.uber.uberApp.entities.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Long> {


}
