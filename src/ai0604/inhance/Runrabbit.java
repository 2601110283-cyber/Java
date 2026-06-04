package ai0604.inhance;

public class Runrabbit {
    static void main(String[] args) {
        houseRabbit hr1 = new houseRabbit();
        hr1.shape = "동그라미";
        hr1.setLocation(30, 50);
        hr1.moveRight();
        hr1.printInfo();
        hr1.masterName = "폴리";
        hr1.eatFeed(("아주 좋은"));


        MountainRabbit mr1 = new MountainRabbit();
        mr1.shape = "세모";
        mr1.moveLeft();
        mr1.moveLeft();
        mr1.printInfo();
        mr1.mountainName = "남산";
        mr1.eatGrass("클로버");

    }
}
