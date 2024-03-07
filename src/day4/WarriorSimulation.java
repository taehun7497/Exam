package day4;

public class WarriorSimulation {
    public static void main(String[] args) {

        // 전사 객체 생성
        전사 a전사 = new 전사();

        // 이름 설정
        String 이름 = "홍길동";
        a전사.이름 = 이름;
        // 나이 설정
        a전사.나이 = 20;
        // 자기소개 메서드 호출
        a전사.자기소개();
        // 출력: 안녕하세요 저는 20살 홍길동입니다.

        // 전사의 무기를 활로 설정
        a전사.a무기 = new 활();
        // 공격 메서드 호출
        a전사.공격();
        // 출력: 홍길동이/가 활로 데미지 15.0 공격
        // 스킬사용 메서드 호출
        a전사.스킬사용();
        // 출력: 홍길동이/가 불화살 스킬을 사용합니다. 1.5배(22.5)의 피해를 입힙니다.

        // 전사의 무기를 칼로 변경
        a전사.a무기 = new 칼();
        // 공격 메서드 호출
        a전사.공격();
        // 출력: 홍길동이/가 칼로 데미지 10.0 공격
        // 스킬사용 메서드 호출
        a전사.스킬사용();
        // 출력: 홍길동이/가 연속 베기 스킬을 사용합니다. 2.0배(20.0)의 피해를 입힙니다.
    }
}

// 전사 클래스 정의
class 전사 {
    // 인스턴스 변수 선언
    String 이름;
    // 인스턴스 변수 선언
    int 나이;
    // 인스턴스 변수 선언
    무기 a무기;

    // 자기소개 메서드 정의
    void 자기소개() {
        System.out.println("안녕하세요. 저는 " + 나이 + "살 " + 이름 + " 입니다.");
    }

    // 공격 메서드 정의
    void 공격() {
        System.out.print(이름 + "이/가 ");
        a무기.사용();
    }

    // 스킬사용 메서드 정의
    public void 스킬사용() {
        System.out.print(이름 + "이/가 ");
        a무기.무기스킬사용();
    }
}

// 무기 클래스 정의
class 무기 {
    // 사용 메서드 정의
    public void 사용() {
    }

    // 무기스킬사용 메서드 정의
    public void 무기스킬사용() {
    }
}

// 칼 클래스 정의 (무기 클래스 상속)
class 칼 extends 무기 {
    // 칼에 대한 데미지, 배율, 스킬 데미지 계산
    double damage = 15;
    double magnification = 2;
    double skillDamage = damage * magnification;

    // 사용 메서드 재정의
    public void 사용() {
        System.out.println("칼로 데미지 " + damage + " 공격");
    }

    // 무기스킬사용 메서드 재정의
    public void 무기스킬사용() {
        System.out.println("연속 베기 스킬을 사용합니다. " + magnification + "배(" + skillDamage + ")의 피해를 입힙니다.");
    }
}

// 활 클래스 정의 (무기 클래스 상속)
class 활 extends 무기 {
    // 활에 대한 데미지, 배율, 스킬 데미지 계산
    double damage = 10;
    double magnification = 1.5;
    double skillDamage = damage * magnification;

    // 사용 메서드 재정의
    public void 사용() {
        System.out.println("활로 데미지 " + damage + " 공격");
    }

    // 무기스킬사용 메서드 재정의
    public void 무기스킬사용() {
        System.out.println("불화살 스킬을 사용합니다. " + magnification + "배(" + skillDamage + ")의 피해를 입힙니다.");
    }
}