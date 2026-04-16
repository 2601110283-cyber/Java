package ai0326;

import java.util.Scanner;
public class simplecaculator {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

    System.out.println("===============simple calculator============");

    System.out.print("정수1 입력 ====>");
    int num1 = s.nextint();
    System.out.print("정수2 입력 ====>");
    int num2 = s.nextint();

        System.out.print("%d + %d= %d\n", num1, num2, num1+num2);
        System.out.print("%d - %d = %d\n", num1, num2, num1-num2);
        System.out.print("%d x %d = %d\n", num1, num2, num1 * num2);
        System.out.print("%d ÷ %d = %.2f\n", num1, num2, (double)num1/num2);
        System.out.print("%d %% %d = %d\n", num1, num2, num1 % num2);

        s.close();

    }
}
