package ai0402;

import java.util.Scanner;

public class drive {
    static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("=======운전면허필기시험 합격여부 확인======");
        System.out.println("필기시험 점수 입력");
        int score = s.nextInt();
        String result = "";//empty String

        if(score >= 70)
            result = "합격";
        else
            result = "불합격";

        System.out.printf("%d점이므로 %s입니다.", score,result);
        //가독성 높이는 법 변수명이나 의미 있게 들여쓰기나 띄어쓰기
        s.close();
    }
}
