package ai04016;

import java.util.Scanner;

public class OverlabifTest {
    static void main(String[] args) {
        System.out.println("======특정 범위 판별 프로그램========");
        Scanner s = new Scanner(System.in);
        System.out.print("*정수를 입력:");
        int num = s.nextInt();
        String result = "";

        if (num > 100) {
            if (num < 1000)
                System.out.printf("입력된 숫자 %d는 100보다 크고 1000보다 작은 숫자다.\n", num);
            else
                System.out.printf("입력된 숫자는 %d는 1000보다 큰 숫자이군요. \n", num);
        }
        else {
            System.out.printf("입력된 숫자 %d는 100보다 작은 숫자이군요.\n", num);
        }
        s.close();
    }
}
