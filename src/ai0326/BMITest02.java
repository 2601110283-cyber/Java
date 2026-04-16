package ai0326;

import java.util.Scanner;

public class scannerTest02 {
    static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("===============BMI(BOdy Index Mass)===============");
        System.out.print("* 체중(kg, 실수값) 입력:");
        double weight = s.nextDouble();

        System.out.print("* 키(cm, 실수값) 입력:");
        double height = s.nextDouble();

        System.out.print("*성명 입력:");
        String name = s.nextLine();

        double bmi = weight / Math.pow(height/100, 2); //((height/100)*(height/100))

        System.out.printf("* %s님의 BMI 지수 결과: %.2f㎏/㎡", bmi);
        s.close();
    }
}
