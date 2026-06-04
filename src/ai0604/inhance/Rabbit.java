package ai0604.inhance;

public class Rabbit {
    // super 클래스의 필드 또는 메소드 옆에 private를 붙이면 sub 클래스의 사용이 제한된다.
    String shape;
    int xPos;
    int yPos;


// JAVA 클래스 내에 생성자가 하나도 없는 경우 기본 생성자를 만들어서 사용한다.
// 그러나 클래서 내에 생성자가 선언 되어 있다면 선언은 생성자만 사용할 수 있다.
    public Rabbit() {
    }

    public Rabbit(String shape){
        this.shape = shape;
    }

    public void setLocation(int x, int y) {
        xPos = x;
        yPos = y;
    }



    public void printInfo(){
        System.out.printf("%s 모양의 토끼는 (%d, %d) 좌표에 위치하고 있다.\n", shape, xPos, yPos);
    }

    //x축으로 10씩 오른쪽으로 이동하는 메소드
    public void moveRight() {
        xPos += 10;
    }

    //x추으로 10씩 왼쪽으로 이동하는 메소드
    public void moveLeft() {
        xPos -= 10;
    }
}
 