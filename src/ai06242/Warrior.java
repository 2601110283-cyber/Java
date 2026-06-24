package ai06242;

public class Warrior extends Character{private int shield; // 전사만의 고유 변수 (방어막)

    // [생성자] 부모 생성자를 부르는 super() 사용
    public Warrior(String name, int hp, int attackPower, int shield) {
        super(name, hp, attackPower); // 부모 클래스의 생성자 호출
        this.shield = shield;
    }

    // [오버라이딩] 부모의 attack을 전사 스타일로 재정의
    @Override
    public void attack(Character target) {
        System.out.println(" [전사 특수 기술] " + getName() + "의 거함 격돌!");
        System.out.println("-> 방어막 수치(" + shield + ")만큼 추가 데미지를 줍니다.");

        int totalDamage = getAttackPower() + this.shield;
        target.takeDamage(totalDamage);
    }
}

