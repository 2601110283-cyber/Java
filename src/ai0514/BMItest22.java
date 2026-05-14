package ai0514;

import java.util.Scanner;

public class BMItest22 {
    public  static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        System.out.println("===============BMI(BOdy Index Mass)===============");

        while(true) {
            System.out.print("* 체중(kg, 실수값) 입력:");
            double weight = s.nextDouble();

            System.out.print("* 키(cm, 실수값) 입력:");
            double height = s.nextDouble();

            System.out.print("*성명 입력(exit: 프로그램 종료):");
            String name = s.nextLine();
            if (name.equals("exit"))
                break;

            double bmi = weight / Math.pow(height / 100, 2); //((height/100)*(height/100))
            String result1, result2;

            if (bmi < 18.5) {
                result1 = "저";
                result2 = "식이요법과 운동을 통해 체중을 증량시켜야 합니다. 생명에 위험이 있을 수도 있습니다.";
            } else if (bmi < 22.9) {
                result1 = "정상";
                result2 = "현재 체중을 유짛시기 바랍니다.";

            } else if (bmi < 24.9) {
                result1 = "고";
                result2 = "식단과 운동을 통해 체중을 감량하시기 바랍니다.";
            } else if (bmi < 29.9) {
                result1 = "비만";
                result2 = "식단과 운동을 통해 체중을 감량하시기 바랍니다. 성인병 유발의 원인이 됩니다.";
            } else {
                result1 = "고도비만";
                result2 = "전문가의 도움을 받아 식단과 운동을 통해 체중을 감량하시기 바랍니다. 고혈압, 고지혈증, 당뇨병의 원인입니다.";
            }
        }







        System.out.printf("* %s님의 BMI 지수 결과: %.2f㎏/㎡");
        System.out.println("* %s체중은 %s");

        s1.close();
        s.close();
    }
        }

