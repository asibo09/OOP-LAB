package it.unibo.design.robot.impl;

public class BaseArm {
    private static final double ENERGY_REQUIRED_TO_MOVE = 0.2;
    private static final double ENERGY_REQUIRED_TO_GRAB = 0.1;

    private boolean grabbing;
    private final String name;
    
    public BaseArm(String name) {
        this.name = name;
    }


    
    public boolean isGrabbing(){
        return this.grabbing;
    }

    public void pickUp(){
        this.grabbing=true;
    }

    public void dropDown(){
        this.grabbing=false;
    }

    public double getConsuptionForPickUp() {
        return ENERGY_REQUIRED_TO_MOVE + ENERGY_REQUIRED_TO_GRAB;
    }

    public double getConsuptionForDropDown() {
        return ENERGY_REQUIRED_TO_MOVE;
    }

    public String toString() {
        return name;
    }

}
    
