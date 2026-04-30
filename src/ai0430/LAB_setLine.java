package ai0430;

public class LAB_setLine {
    static void main(String[] args) {
        int fact = 1;
        int friends_num = 5;
        for (int i = 1; i <= friends_num; i++){
            fact = fact * i;
        }
        System.out.println("다섯명의 학생들을 줄 세우는 수 :" + fact);
    }
}
