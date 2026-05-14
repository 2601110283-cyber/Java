package ai0514;

import java.util.Random;
import java.util.Scanner;

public class computergame {
    static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int i = 1;
        int num = 0;
        int computnum = 0;
        Random random = new Random();
        while (true){
            computnum = random.nextInt(5) + 1;
            System.out.print("게임 "+ i + "회: 컴퓨터가 생각한 숫자는 무엇일까요?");
            num = s.nextInt();
            if(computnum == num){
                System.out.println("축하합니다 정답입니다.");
                break;
            }
            System.out.println("까비." + computnum + "였는데, 다시 ㄱㄱ");
            i++;
        }
        System.out.println("게임을 마칩니다");
    }
}
