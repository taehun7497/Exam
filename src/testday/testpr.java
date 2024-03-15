public class Main {
    public static void main(String[] args) {


        Person p1 = new Person(); // 사람이 태어납니다.
        p1.age = 27;
        p1.name = "홍길동";

        Person p2 = new Person(); // 사람이 태어납니다.
        p2.age = 25;
        p2.name = "홍길순";

        p1.introduce(); // 안녕하세요 27살 홍길동입니다.
        p2.introduce(); // 안녕하세요 25살 홍길순입니다.
//
        Car c1 = new Car(); // 자동차가 만들어집니다.
        c1.model = "소나타";
        c1.color = "하얀색";
        c1.speed = 100;

        Car c2 = new Car(); // 자동차가 만들어집니다.
        c2.model = "모닝";
        c2.color = "검정색";
        c2.speed = 70;

        c1.drive(); // 하얀색 소나타이/가 100km로 달립니다.
        c2.drive(); // 검정색 모닝이/가 70km로 달립니다.


        Cat cat1 = new Cat(); // 고양이가 태어납니다.
        cat1.name = "아리";
        cat1.age = 4;
        cat1.kind = "러시안블루";

        Cat cat2 = new Cat(); // 고양이가 태어납니다.
        cat2.name = "망고";
        cat2.age = 6;
        cat2.kind = "샴";

        cat1.meow(); // 4살 러시안블루 고양이 아리가 야옹하고 웁니다.
        cat2.meow(); // 6살 샴 고양이 망고가 야옹하고 웁니다.


        Warrior w1 = new Warrior(); // 전사가 태어납니다.
        w1.name = "이순신";
        w1.attack = 20;
        w1.defense = 10;

        Warrior w2 = new Warrior(); // 전사가 태어납니다.
        w2.name = "강감찬";
        w2.attack = 15;
        w2.defense = 15;

        w1.status(); // 이름 : 이순신, 공격력 : 20, 방어력 : 10
        w2.status(); // 이름 : 강감찬, 공격력 : 15, 방어력 : 15

        w1.attack(); // 이순신이 20의 데미지를 입힙민다.
        w2.attack(); // 강감찬이 15의 데미지를 입힙민다.

        w1.defense(); // 이순신이 10 데미지를 방어합니다.
        w2.defense(); // 강감찬이 15 데미지를 방어합니다.

    }
}

class Person{
    int age;
    String name;

    public void introduce() {
        System.out.printf("안녕하세요 %d살 %s입니다.\n", age, name);
    }
}

class Car {
    String model;
    String color;
    int speed;

    public void drive() {
        System.out.printf("%s %s이/가 %dkm로 달립니다.\n", color, model, speed);
    }
}

class Cat {
    String name;
    String kind;
    int age;

    public void meow() {
        System.out.printf(" %d살 %s 고양이 %s가 야옹하고 웁니다.\n", age, kind, name);
    }
}


class Warrior {

    // 상태
    String name;
    int attack;
    int defense;

    // 동작
    public void status() {
        System.out.printf("이름 : %s, 공격력 : %d, 방어력 : %d \n", name, attack, defense);
    }
    public void attack() {
        System.out.printf("%s이 %d의 데미지를 입힙민다.\n", name, attack);
    }
    public void defense() {
        System.out.printf("%s이 %d 데미지를 방어합니다..\n", name, defense);
    }
}

//public class Main {
//    public static void main(String[] args) {
//        샤오미Tv a샤오미Tv = new 샤오미Tv();
//        삼성Tv a삼성Tv = new 삼성Tv();
//        LGTv aLGTv = new LGTv();
//
//        a샤오미Tv.켜기();
//        // 출력 => 샤오미Tv 켜집니다.
//        a샤오미Tv.끄기();
//        // 출력 => 샤오미Tv 꺼집니다.
//        a샤오미Tv.vr켜기();
//        // 출력 => 샤오미Tv vr켜기!
//
//        a삼성Tv.켜기();
//        // 출력 => 삼성Tv 켜집니다.
//        a삼성Tv.끄기();
//        // 출력 => 삼성Tv 꺼집니다.
//        a삼성Tv.ar켜기();
//        // 출력 => 삼성Tv ar켜기!
//
//        aLGTv.켜기();
//        // 출력 => LGTv 켜집니다.
//        aLGTv.끄기();
//        // 출력 => LGTv 꺼집니다.
//        aLGTv.게임모드전환();
//        // 출력 => LGTv 게임모드전환!
//
//        System.out.println("== 표준Tv 리모콘 들여온 후 ==");
//
//        // 표준Tv 리모콘을 만든다.
//        표준Tv a표준Tv;
//
//        // a표준Tv 변수에 샤오미Tv 객체를 연결한다.
//        a표준Tv = a샤오미Tv;
//        a표준Tv.켜기();
//        // 출력 : 샤오미TV 켜집니다.
//        a표준Tv.끄기();
//        // 출력 : 샤오미TV 꺼집니다.
//
//        // a표준Tv 변수에 삼성Tv 객체를 연결한다.
//        a표준Tv = a삼성Tv;
//        a표준Tv.켜기();
//        // 출력 : 삼성TV 켜집니다.
//        a표준Tv.끄기();
//        // 출력 : 삼성TV 꺼집니다.
//
//        // a표준Tv 변수에 LGTv 객체를 연결한다.
//        a표준Tv = aLGTv;
//        a표준Tv.켜기();
//        // 출력 : LGTV 켜집니다.
//        a표준Tv.끄기();
//        // 출력 : LGTV 꺼집니다.
//
//
//        LGTv aLGTv2 = (LGTv)a표준Tv;
//        aLGTv2.게임모드전환();
//    }
//}
//
//abstract class 표준Tv{ // 추상클래스
//    abstract void 켜기();  // 추상메서드
//
//    abstract void 끄기();
//
//}
//class 샤오미Tv extends 표준Tv { // 표준Tv 에게 물려받은 켜기 메서드가 내용이 없는 추상메서드이기 때문에 오버라이딩 하지 않으면 실행 할 수 없음
//    void 켜기() {
//        System.out.println("샤오미Tv 켜집니다.");
//    }
//
//    void 끄기() {
//        System.out.println("샤오미Tv 꺼집니다.");
//    }
//
//    void vr켜기() {
//        System.out.println("샤오미Tv vr켜기!");
//    }
//}
//
//class 삼성Tv extends 표준Tv {
//    void 켜기() {
//        System.out.println("삼성Tv 켜집니다.");
//    }
//
//    void 끄기() {
//        System.out.println("삼성Tv 꺼집니다.");
//    }
//
//    void ar켜기() {
//        System.out.println("삼성Tv ar켜기!");
//    }
//}
//
//class LGTv extends 표준Tv {
//    void 켜기() {
//        System.out.println("LGTv 켜집니다.");
//    }
//
//    void 끄기() {
//        System.out.println("LGTv 꺼집니다.");
//    }
//
//    void 게임모드전환() {
//        System.out.println("LGTv 게임모드전환!");
//    }
//}