package day5;
public class ConstructorChain {
    public static void main(String[] args) {
        cat c1 = new cat();
    }
}
class animal {
    public animal(){} //기본생성자 축가
    int age;
    public animal(int age){
        System.out.println("동물이 생성되었습니다.");
    }
}
class cat extends animal{
    public cat(){
        super(); //부모 생성자 호출
    //    System.out.println("동물이 생성되었습니다.");
    }
}