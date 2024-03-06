package day3;

public class Reference {
    public static void main(String[] args) {
        Person p1 = new Person(); // 객체가 힙 메모리에 생성
        Person p2 = new Person();
        Person p4 = new Person();
        Person p5 = new Person();


        System.out.println(p4);
        System.out.println(p5);

        p1.name="홍길동";
        p1.age=20;
        p1.home="서울";
        System.out.println(p1.name);

        Person p3 = p1;
        System.out.println(p3.name);

        p3.name="이순신";
        System.out.println(p3.name);
        System.out.println(p1.name);

        p4.name="손흥민";
        p4.age=31;
        p4.home="런던";
        p5.name="손흥민";
        p5.age=31;
        p5.home="런던";

        //객체의 복사
        //참조값의 복사 -> 얕은 복사
        //객체값의 복사 -> 깊은 복사
    }
}