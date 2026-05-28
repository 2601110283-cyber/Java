package car0521.rabbit;

import java.util.Random;

public class runrabbit {
    public static void main(String[] args) {
        rabbit rabbit1 = new rabbit();
        rabbit rabbit2 = new rabbit("좁은 네모");

        rabbit1.setlocation(50, 50);
        rabbit2.setlocation(150,70);

        rabbit1.setshape("기본");
        rabbit1.printInfo();
        rabbit2.printInfo();

        //기본 모양의 토끼를 다이아몬드 모양의 토끼로 변경하고 위치는 현재 x 좌표에서 오른쪽으로 60 이동, y좌표는 아래쪽으로 20 이동 후 출력
        rabbit1.setshape("다이아몬드");
        rabbit1.setXpos(rabbit1.getXpos() + 60);
        rabbit1.setYpos(rabbit1.getYpos() + 20);

        rabbit1.printInfo();

       // 좁은 네모 모양의 토끼가 현재 위치에서 오른쪽으로 50만큼, 왼쪽으로 20만큼 이동
        rabbit2. printInfo();
        for (int i = 0; i < 5; i++){
            rabbit2.moveRightTen();
        }
        for (int i = 0; i < 2; i++){
            rabbit2.moveLeftTen();
        }

        rabbit2.printInfo();

    }
}
