package ImplementationOfDesignPatterns.strategyDesignPattern;

import ImplementationOfDesignPatterns.strategyDesignPattern.strategy.DriveStrategy;
import ImplementationOfDesignPatterns.strategyDesignPattern.strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle{
    OffRoadVehicle() {
        super(new SportsDriveStrategy());
    }
}
