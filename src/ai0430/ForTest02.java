package ai0430;

public class ForTest02 {
    static void main(String[] args) {
        for (int i =0; i < 100; i++) {
            System.out.println(i + 1 + "\t");
            if((i+1) % 20 == 0)
                System.out.println();
        }
    }
}
