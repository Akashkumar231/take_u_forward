package ImplementationOfDesignPatterns.strategyDesignPattern;

import ImplementationOfDesignPatterns.strategyDesignPattern.strategy.DriveStrategy;
import ImplementationOfDesignPatterns.strategyDesignPattern.strategy.SportsDriveStrategy;

public class SportsVehicle  extends Vehicle{
    SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
