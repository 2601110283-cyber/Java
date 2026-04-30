package ai0326;

import java.util.Calendar;
import java.util.Scanner;

public class scannerTest01 {
    public static void main(String[] args) {
        System.out.println("=====  나이 계산 =====");

        Scanner s = new Scanner(System.in);

        System.out.printf("출생년도를 입력하세요:");

        int birthYear = s.nextInt();
        //   현재년도 구하기
        Calendar calendar = Calendar.getInstance();

        int nowYear = calendar.get(calendar.YEAR);

        int age = nowYear - birthYear;

        System.out.println("당신의 현재 나이는  "+ age +"세 입니다.");

        s.close();
    }
}
