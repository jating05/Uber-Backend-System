package com.jatingoyal.project.uber.uberApp.services;

import com.jatingoyal.project.uber.uberApp.dto.DriverDto;
import com.jatingoyal.project.uber.uberApp.dto.SignupDto;
import com.jatingoyal.project.uber.uberApp.dto.UserDto;

public interface AuthService {

    String[] login(String email, String password);

    UserDto signup(SignupDto signupDto);

    DriverDto onboardNewDriver(Long userId, String vehicleId);

}
