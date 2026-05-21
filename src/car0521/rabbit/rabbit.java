package car0521.rabbit;

public class rabbit {
        private String shape;       //토끼의 모양
        private int xPos;           //x 위치
        private int yPos;           //y 위치
    public rabbit() {
    }
    public rabbit(String shape){
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }

    public int getxPos() {
        return xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }
}
