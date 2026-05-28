package ai0528.access.modfire;

import ai0528.access.Rabbit;

public class Runrabbit {
    static void main(String[] args) {
        Rabbit rabbit = new Rabbit();

      //  rabbit.setShape("동그라미");
        rabbit.shape = ("삼각형");

        rabbit.printInfo();
        //rabbit.setLocation(50, 80);
        rabbit.x = 70;
        rabbit.y = 100;
        rabbit.printInfo();
    }
}
