package ImplementationOfDesignPatterns.strategyDesignPattern;

import ImplementationOfDesignPatterns.strategyDesignPattern.strategy.DriveStrategy;

public class Vehicle {

    private DriveStrategy driveStrategy;

    Vehicle(DriveStrategy driveStrategy){
        this.driveStrategy=driveStrategy;
    }

    public void drive(){
        driveStrategy.drive();
    }

}
