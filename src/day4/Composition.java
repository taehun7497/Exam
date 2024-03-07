package day4;

public class Composition {
    public static void main(String[] args) {
        홍길동 a홍길동 = new 홍길동();
        a홍길동.자바();

        홍길순 a홍길순 = new 홍길순();
        a홍길순.파이썬();

        a홍길동.파이썬();

        이순신주식회사 a이순신주식회사 = new 이순신주식회사();
        a이순신주식회사.파이썬();
        a이순신주식회사.자바();

        사람 a사람 = new 사람();
        a사람.나이 = 20;
        a사람.a왼팔 = new 팔();
        System.out.println(a사람.a왼팔.길이 + "cm");
        // 출력 : 100cm
    }
}

class 홍길동 {

    홍길순 a홍길순 = new 홍길순();

    public void 자바(){
        System.out.println("자바 17버전 프로그래밍");
    }

    public void 파이썬(){
        a홍길순.파이썬();
    }
}

class 홍길순 {
    public void 파이썬(){
        System.out.println("파이썬 3.10버전 프로그래밍");
    }
}

class 이순신주식회사 {

    홍길동 a홍길동 = new 홍길동();
    홍길순 a홍길순 = new 홍길순();

    public void 자바() {
        a홍길동.자바();
    }
    public void 파이썬() {
        a홍길순.파이썬();
    }
}

class 사람 {
    int 나이 = 20;
    팔 a왼팔;
}

class 팔 {
    int 길이 = 100;
}