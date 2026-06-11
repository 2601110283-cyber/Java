package ai0611.lab.subcar;

import ai0611.lab.car.SpeedCar;

public class SchoolBus extends SpeedCar {
    @Override
    public void upSpeed(int speed) {
        super.upSpeed(speed);
        if (this.speed >= 60) {
            this.speed = 60;
        }
    }

}
