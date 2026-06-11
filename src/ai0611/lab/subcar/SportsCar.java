package ai0611.lab.subcar;

import ai0611.lab.car.SpeedCar;

public class SportsCar extends SpeedCar {
    @Override
    public void upSpeed(int speed){
        super.upSpeed(speed);
        if(this.speed >= 200){
            this.speed = 200;
        }
    }
}
