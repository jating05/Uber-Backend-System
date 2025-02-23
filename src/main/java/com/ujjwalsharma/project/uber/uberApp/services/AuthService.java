package com.ujjwalsharma.project.uber.uberApp.services;

import com.ujjwalsharma.project.uber.uberApp.dto.DriverDto;
import com.ujjwalsharma.project.uber.uberApp.dto.SignupDto;
import com.ujjwalsharma.project.uber.uberApp.dto.UserDto;

public interface AuthService {
    String login(String email, String password);

    UserDto signup(SignupDto signupDto);

    DriverDto onboardNewDRiver(Long UserId);
}
