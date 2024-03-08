package day5;

public class Overloading {
    public static void main(String[] args) {
        calculrator c1 = new calculrator();
        int rst = c1.plus(1, 2);
        int rst2 = c1.plus(3, 4);

        System.out.println(rst);
        System.out.println(rst2);
    }
}

//함수(매서드)의 이름이 길어도 매개변수의 타입이 다르거나 개수가 다르면 다른 함수로 인식한다 -> 오버로딩
class calculrator {

    int plus(int num1, int num2) {
        return num1 + num2;
    }

    double plus(double num1, double num2) {
        return num1 + num2;
    }
}
