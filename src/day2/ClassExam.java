package day2;

public class ClassExam {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "홍길동";
        p1.age = 27;

        Person p2 = new Person();
        p2.name = "홍길순";
        p2.age = 25;

        System.out.println("안녕하세요 " + p1.age + "살 " + p1.name + "입니다."); // 안녕하세요 27살 홍길동입니다.
        System.out.println("안녕하세요 " + p2.age + "살 " + p2.name + "입니다."); // 안녕하세요 25살 홍길순입니다.


        Car c1 = new Car();
        c1.model = "소나타";
        c1.color = "하얀색";
        c1.speed = 100;

        // =====================================================
        Car c2 = new Car();
        c2.model = "그랜저";
        c2.color = "검정색";
        c2.speed = 120;

        // =====================================================

        System.out.println(c1.color + " " + c1.model + " 이/가 " + c1.speed + "km로 달립니다."); // 하얀색 소나타이/가 100km로 달립니다.
        System.out.println(c2.color + " " + c2.model + " 이/가 " + c2.speed + "km로 달립니다."); // 검정색 모닝이/가 70km로 달립니다.

        Cat cat1 = new Cat();
        cat1.name = "아리";
        cat1.age = 4;
        cat1.kind = "러시안블루";

        // =====================================================
        Cat cat2 = new Cat();
        cat2.name = "하루";
        cat2.age = 2;
        cat2.kind = "랙돌";

        // =====================================================

        System.out.println(cat1.age+ "살 " + cat1.kind + "고양이 " + cat1.name + "이/가 야옹하고 웁니다."); // 4살 러시안블루 고양이
        System.out.println(cat2.age+ "살 " + cat2.kind + "고양이 " + cat2.name + "이/가 야옹하고 웁니다."); // 6살 샴 고양이 망고가 야옹하고 웁니다.


        Warrior w1 = new Warrior();
        w1.name = "이순신";
        w1.attack = 20;
        w1.defense = 10;

        // =====================================================
        Warrior w2 = new Warrior();
        w2.name = "다리우스";
        w2.attack = 74;
        w2.defense = 36;

        // =====================================================

        System.out.println(w1.name + "이 " + w1.attack + "의 데미지를 입힙니다."); // 이순신이 20의 데미지를 입힙니다.
        System.out.println(w2.name + "이 " + w2.attack + "의 데미지를 입힙니다."); // 강감찬이 15의 데미지를 입힙니다.

    }
}

// ===========================================================
// Person, Car, Cat, Warrior 클래스 만들기
class Person {
    String name;
    int age;
}
class Car {
    String model;
    String color;
    int speed;
}

class Cat {
    String name;
    int age;
    String kind;
}

class Warrior {
    String name;
    int attack;
    int defense;
}





// ===========================================================

