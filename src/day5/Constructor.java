package day5;

public class Constructor {
    public static void main(String[] args) {
        person p1 = new person(20, "홍길동", "서울");

//        p1.age = 20;
//        p1.name = "홍길동";
//        p1.home = "서울";
//        p1.reset(20, "홍길동", "서울");
        p1.myself(); //객체가 올바르게 작동하는데 데이터가 반드시 필요하다.

        person p2 = new person(30, "홍길순", "부산");

//        p2.age = 30;
//        p2.name = "홍길순";
//        p2.home = "부산";
//        p2.reset(30, "홍길순", "부산");
        p2.myself();

//        new person(); //생성자 호출

    }
}

class person {
    int age;
    String name;
    String home;

    //생성자 -> 객체가 생성될때 자동으로 호출되는 메서드
    //작성규칙 -> 리턴타입 X, 이름은 무조건 클래스이름과 동일하게

    public person(int age, String name, String home){
        System.out.println("사람이 한명 만들어집니다.");
        this.age = age;
        this.name = name;
        this.home = home;
    }

    // 함수의 지역변수와 객체의 인스턴스 변수는 동일한 이름으로 존재 가능
//    public void reset(int age, String name, String home){
//        //this는 객체를 가리킨다.
//        this.age = age;
//        this.name = name;
//        this.home = home;
//    }

    // public person(){} // 기본 생성자, 안만들면 자바가 자동으로 만들어줌
    //다만 내가 생성자를 의도적으로 만들면 자바른 기본생성자를 더이상 만들어주지 않음
    public void myself(){
        System.out.println("안녕하세요 저는 " + home + "사는 " + age + "살 " + name + "입니다.");
    }
}
