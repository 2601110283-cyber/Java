package ai06242;

public class Mage extends Character{private int mp; // 마법사만의 고유 변수 (마나)

    // [생성자] 부모 생성자를 부르는 super() 사용
    public Mage(String name, int hp, int attackPower, int mp) {
        super(name, hp, attackPower); // 부모 클래스의 생성자 호출
        this.mp = mp;
    }

    // [오버라이딩] 부모의 attack을 마법사 스타일로 재정의
    @Override
    public void attack(Character target) {
        System.out.println("[마법사 특수 기술] " + getName() + "의 메테오 스트라이크!");

        if (this.mp >= 20) {
            this.mp -= 20;
            System.out.println("-> 마나 20을 소비하여 2배의 강력한 마법 데미지를 입힙니다. (남은 MP: " + this.mp + ")");
            target.takeDamage(getAttackPower() * 2);
        } else {
            System.out.println("-> 마나가 부족하여 일반 마법 공격을 시도합니다.");
            target.takeDamage(getAttackPower());
        }
    }
}

