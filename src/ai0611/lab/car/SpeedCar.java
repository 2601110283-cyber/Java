package ai0611.lab.car;

public class SpeedCar {
    //protected 접근 제한자  상속관계에 있는 sub class(자식 클래스)만 접근 가능
        protected int speed;

      public  void upSpeed(int speed){
            this.speed += speed;
    }
    public int getSpeed() {
          return speed;
    }
}
