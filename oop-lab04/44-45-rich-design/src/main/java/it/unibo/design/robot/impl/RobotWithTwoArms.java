package it.unibo.design.robot.impl;

import it.unibo.design.robot.api.RobotWithArms;

public class RobotWithTwoArms extends BaseRobot implements RobotWithArms {

    public static final double TRANSPORT_OBJECT_CONSUMPTION = 0.1;

    private final BaseArm leftArm;
    private final BaseArm rightArm;


    public RobotWithTwoArms(String robotName) {
        super(robotName);
        this.leftArm= new BaseArm("left arm");
        this.rightArm= new BaseArm("right arm");
    }

    public boolean pickUp() {
        if (rightArm.isGrabbing()) {
            if (leftArm.isGrabbing()) {
                return false;
            }
            doPick(leftArm);
        } else {
            doPick(rightArm);
        }
        return true;
    }

    @Override
    public boolean dropDown() {
        if (leftArm.isGrabbing()) {
            doRelease(leftArm);
            return true;
        }
        if (rightArm.isGrabbing()) {
            doRelease(rightArm);
            return true;
        }
        return false;
    }

    public int getCarriedItemsCount() {
        return (leftArm.isGrabbing() ? 1 : 0) + (rightArm.isGrabbing() ? 1 : 0);
    }

    protected double getBatteryRequirementForMovement() {
        return super.getBatteryRequirementForMovement() + getCarriedItemsCount() * TRANSPORT_OBJECT_CONSUMPTION;
    }

    private void doPick(final BaseArm arm) {
        if (isBatteryEnough(arm.getConsuptionForPickUp()) && !arm.isGrabbing()) {
            log(arm + " is picking an object");
            arm.pickUp();
            consumeBattery(arm.getConsuptionForPickUp());
        } else {
            log("Can not grab (battery=" + this.getBatteryLevel() + "," + arm + " isGrabbing=" + arm.isGrabbing() + ")");
        }
    }

    private void doRelease(final BaseArm arm) {
        if (isBatteryEnough(arm.getConsuptionForDropDown()) && arm.isGrabbing()) {
            this.log(arm + " is releasing an object");
            arm.dropDown();
            this.consumeBattery(arm.getConsuptionForDropDown());
        } else {
            log("Can not release (batteryLevel=" + this.getBatteryLevel() + "," + arm + " isGrabbing="
                    + arm.isGrabbing() + ")");
        }
    }

}
