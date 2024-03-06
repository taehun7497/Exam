package day3;

public class ScopeExam {
    public static void main(String[] args) {
        // 문제 : 자동차가 3번 달리게 해주세요.
        // 출력 : 자동차가 달립니다.
        // v1. 1개의 자동차가 3번 달리게 해주세요.
        dday3.Car carV1 = new dday3.Car();
        for (int i = 0; i < 3; i++) {
            carV1.run();
        }

        // v2. 3개의 자동차가 1번씩 달리게 해주세요.
        dday3.Car carV2_1 = new dday3.Car();
        dday3.Car carV2_2 = new dday3.Car();
        dday3.Car carV2_3 = new dday3.Car();

        carV2_1.run();
        carV2_2.run();
        carV2_3.run();

        // 1. 자동차가 자신의 최고속력으로 달리게 해주세요.
        // 출력: 자동차가 최대속력 220km로 달립니다.
        Car car1 = new Car(220);
        car1.drive();

        // 2. 두 자동차가 자신의 최고속력으로 달리게 해주세요.
        // 출력: 자동차가 최대속력 220km로 달립니다.
        // 출력: 자동차가 최대속력 250km로 달립니다.
        Car car2 = new Car(220);
        Car car3 = new Car(250);

        car2.drive();
        car3.drive();

        Person person1 = new Person();
        person1.name = "홍길동";
        person1.age = 22;

        person1.introduce();
        // 출력: 저는 22살 홍길동 입니다.

        Person person2 = new Person();
        person2.name = "홍길순";
        person2.age = 25;

        person2.introduce();
        // 출력: 저는 25살 홍길순 입니다.

        person1.introduce();
        // 출력: 저는 22살 홍길동 입니다.
    }
}
