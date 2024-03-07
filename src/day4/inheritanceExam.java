package day4;

public class inheritanceExam {
    public static void main(String[] args) {
        Duck d1 = new Duck();
        d1.fly();
        d1.swim();
        // 출력 : 오리가 날개로 날아갑니다.
        mallard_duck d2 = new mallard_duck();
        d2.fly();
        d2.swim();

        white_Duck d3 = new white_Duck();
        d3.fly();
        d3.swim();

        rubber_Duck d4 = new rubber_Duck();
        d4.fly();
        d4.swim();

        rubber_Duck2 d5 = new rubber_Duck2();
        d5.fly();
        d5.swim();

        asura_Duck d6 = new asura_Duck();
        d6.fly();
        d6.swim();
    }
}

class every_Duck{
    public void fly(){
        System.out.println("오리가 날개로 날아갑니다.");
    }

    public void swim(){
        System.out.println("오리가 오리발로 헤엄칩니다.");
    }
}

class Duck extends every_Duck{

}

class mallard_duck extends every_Duck{

}

class white_Duck extends every_Duck{

}

class rubber_Duck extends every_Duck{
    // 메서드 오버라이드 (재정의) => 부모한테 물려받은 메서드와 동일한 이름의 메서드를 다시 정의하는 것.
    //자신에게 가까운 메서드를 우선적으로 사용 (3개)
    public void fly(){
        System.out.println("저는 날 수 없어요. ㅠㅠ");
    }

    public void swim(){
        System.out.println("오리가 둥둥 떠다닙니다.");
    }
}

class rubber_Duck2 extends rubber_Duck{

}

// 상속으로 모든 중복을 해결할 수는 없다.
// 상속은 다른 클래스에 영향을 미친다. -> 캡슐화 한다.
class asura_Duck extends rubber_Duck{
    public void fly(){
        System.out.println("오리가 날개로 날아갑니다.");
    }
}
