package ImplementationOfDesignPatterns.strategyDesignPattern;

import ImplementationOfDesignPatterns.strategyDesignPattern.strategy.DriveStrategy;
import ImplementationOfDesignPatterns.strategyDesignPattern.strategy.NormalDriveStrategy;

public class GoodVehicle extends Vehicle{

    GoodVehicle() {
        super(new NormalDriveStrategy());
    }
}
