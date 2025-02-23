package com.ujjwalsharma.project.uber.uberApp.services.impl;

import com.ujjwalsharma.project.uber.uberApp.services.DistanceService;
import org.locationtech.jts.geom.Point;
import org.springframework.stereotype.Service;

@Service
public class DistanceServiceOSRMImpl implements DistanceService {
    @Override
    public double calaculatedistance(Point src, Point dest) {
        return 0;
    }
}
