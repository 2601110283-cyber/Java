package ai0402;

import java.util.Scanner;

public class kg {
    static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        double lb = 0.54248;
        double kg = 0.45462;
        double result = 0;
        System.out.println("============ 파운드/킬로그램 단위 변환기===========");

        System.out.print("파운드(lb)값 입력하세요");
        int input = s.nextInt();
        result = input * lb;
        System.out.printf("%d 파운드(lb)는 % .3f 킬로그램(kg)입니다.\n", input,result);

        System.out.print("킬로그램(kg)값 입력");
        int input2 = s.nextInt();
        result = input2 * kg;
        System.out.printf("%d킬로그램(kg)는 %.3f파운드(lb) 입니다.\n", input2,result);

        s.close();
    }
}
