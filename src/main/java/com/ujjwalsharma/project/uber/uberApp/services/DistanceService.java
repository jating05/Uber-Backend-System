package com.ujjwalsharma.project.uber.uberApp.services;

import org.locationtech.jts.geom.Point;

public interface DistanceService {
    double calaculatedistance(Point src, Point dest);
}
