package car0521;

public class Runcar {
    public static void main(String[] args) {
        car sonata = new car("현대자동차", "소나타", 1600, "은색", 40000000);
        System.out.println("=============자동차 정보==========");
        System.out.println("제조사: " + sonata.getProduct());
        System.out.println("차량모델:" + sonata.getName());
        System.out.println("배기량: " + sonata.getDisplacement() + "cc");
        System.out.println("색상: " + sonata.getColor());
        System.out.println("가격: " + sonata.getPrice());


        sonata.startOn();
        sonata.drive();
        sonata.forward();
        sonata.rotate("좌회전");
        sonata.drive();


        car ev6 = new car();
        ev6.setProduct("기아자동차");
        ev6.setName("ev6");
        ev6.setDisplacement(2000);
        ev6.setColor("파랑");
        ev6.setPrice(50000000);


        System.out.println("제조사: " + ev6.getProduct());
        System.out.println("차량모델:" + ev6.getName());
        System.out.println("배기량: " + ev6.getDisplacement() + "cc");
        System.out.println("색상: " + ev6.getColor());
        System.out.println("가격: " + ev6.getPrice());

    }
}
