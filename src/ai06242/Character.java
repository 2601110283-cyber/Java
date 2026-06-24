package ai06242;

public class Character {private String name;
    private int hp;
    private int attackPower;

    // [생성자] 캐릭터가 생성될 때 이름, 체력, 공격력을 필수 인자로 받음
    public Character(String name, int hp, int attackPower) {
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
    }

    // 기본 공격 메서드 (자식들이 오버라이딩 할 예정)
    public void attack(Character target) {
        System.out.println(this.name + "(이)가 " + target.getName() + "을(를) 기본 공격합니다.");
        target.takeDamage(this.attackPower);
    }

    // 데미지를 입는 메서드
    public void takeDamage(int damage) {
        this.hp -= damage;
        if (this.hp < 0) this.hp = 0;
        System.out.println(this.name + "이(가) " + damage + "의 피해를 입었습니다. (남은 HP: " + this.hp + ")");
    }

    // Getter 메서드들 (private 변수에 접근하기 위함)
    public String getName() { return name; }
    public int getHp() { return hp; }
    public int getAttackPower() { return attackPower; }
    public void setHp(int hp) { this.hp = hp; }

}
