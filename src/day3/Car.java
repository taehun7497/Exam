package day3;

public class Car {
    int maxSpeed;

    public Car(int Speed) {
        maxSpeed = Speed;
    }

    public void drive() {
        System.out.println("자동차가 최대속력 " + maxSpeed + "km로 달립니다.");
    }

    public void run() {
        System.out.println("자동차가 달립니다.");
    }
}
