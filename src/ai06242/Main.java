package ai06242;

import java.util.Scanner;

public class Main {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("=========================================");
    System.out.println("     턴제 미니 RPG 과제 제출용 프로그램     ");
    System.out.println("=========================================");
    System.out.print("당신의 용사 이름을 입력하세요: ");
    String userName = scanner.nextLine();

    System.out.println("\n[직업을 선택하세요]");
    System.out.println("1. 전사 (높은 체력 + 방어막 추가 데미지)");
    System.out.println("2. 마법사 (낮은 체력 + 마나 소모 2배 데미지)");
    System.out.print("선택 (1 또는 2): ");
    int choice = scanner.nextInt();

    // 다형성을 활용하여 부모 타입의 참조변수로 자식 객체를 가리킴
    Character player;

    if (choice == 1) {
        // 전사 객체 생성 (이름, HP:120, 공격력:15, 방어막:10)
        player = new Warrior(userName, 120, 15, 10);
        System.out.println(" 전사가 생성되었습니다.");
    } else {
        // 마법사 객체 생성 (이름, HP:80, 공격력:25, MP:50)
        player = new Mage(userName, 80, 25, 50);
        System.out.println("마법사가 생성되었습니다.");
    }

    // 악당 마왕 객체 생성 (일반 Character 객체 활용)
    Character boss = new Character("최종 마왕", 150, 18);
    System.out.println(boss.getName() + "이(가) 나타났습니다! 전투를 시작합니다.");
    System.out.println("=========================================");

    // 턴제 전투 루프 시작
    int turn = 1;
    while (player.getHp() > 0 && boss.getHp() > 0) {
        System.out.println("\n------- [ TURN " + turn + " ] -------");
        System.out.println("[" + player.getName() + " HP: " + player.getHp() + "]  vs  [" + boss.getName() + " HP: " + boss.getHp() + "]");
        System.out.println("1. 공격하기 | 2. 도망치기");
        System.out.print("행동을 선택하세요: ");
        int action = scanner.nextInt();

        if (action == 2) {
            System.out.println("도망쳤습니다! ");
            System.out.println("=========================================");
            scanner.close();
            return; // ★ 핵심: 승패 판정 로직으로 안 내려가고 프로그램을 여기서 아예 종료함
        }

        // 플레이어의 공격 (오버라이딩된 자식 클래스의 attack이 실행됨)
        player.attack(boss);

        // 마왕이 살아있다면 마왕도 반격
        if (boss.getHp() > 0) {
            System.out.println("");
            boss.attack(player);
        }

        turn++;
    }

    // 게임 종료 결과 출력
    System.out.println("\n=========================================");
    System.out.println("               [ 전투 종료 ]             ");
    System.out.println("=========================================");
    if (player.getHp() > 0) {
        System.out.println("축하합니다! " + boss.getName() + "을(를) 물리치고 학점 A+를 쟁취했습니다!");
    } else {
        System.out.println("패배했습니다... 마왕에게 영혼을 저당 잡혔습니다. (재수강 각)");
    }
    System.out.println("=========================================");

    scanner.close();
}
}

