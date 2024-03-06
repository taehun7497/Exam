package day3;
public class MethodExam {

    public static void hi() {
        System.out.println("안녕하세요. 저는 홍길동입니다. 잘부탁드립니다.");
    }

    public static void bye() {
        System.out.println("안녕히 가세요. 다음에 또 봐요!");
    }

    public static void hi1() {
        System.out.println("저는 차태진입니다.");
    }

    public static void hi2() {
        System.out.println("안녕하세요.");
    }

    public static void hi3() {
        System.out.println("프로그램을 만들어보아요.");
    }

    public static void hi4() {
        System.out.println("자바를 통해");
    }

    public static void greeting1(int num) {
        if (num == 1){
            System.out.println("안녕하세요");
        }else if(num == 2) {
            System.out.println("하이");
        }else if (num == 3){
            System.out.println("봉쥬");
        }
    }

    public static void greeting2 (int num, int num1){
        if (num == 1){
            for(int i = 1; i <= num1; i++){
                System.out.println("안녕하세요");
            }
        }else if(num == 2) {
            for(int i = 1; i <= num1; i++){
                System.out.println("하이");
            }
        }else if (num == 3){
            for(int i = 1; i <= num1; i++){
                System.out.println("봉쥬");
            }
        }
    }
    public static void main(String[] args) {

        // hi, bye 각각의 맞게 출력되기 위한 함수를 정의해주세요.

        hi();
        // 안녕하세요. 저는 홍길동입니다. 잘부탁드립니다.

        bye();
        // 안녕히 가세요. 다음에 또 봐요!

        // 메서드를 올바르게 호출해서 아래처럼 출력되게 해주세요.
        // 안녕하세요!!
        // 저는 차태진입니다.
        // 자바를 통해
        // 프로그램을 만들어보아요.

        hi2();

        hi1();

        hi4();

        hi3();

        // 매개변수는 인사말 언어를 의미
        // 1은 한국어, 2는 영어, 3은 프랑스어

        greeting1(2);
        // 하이~

        greeting1(3);
        // 봉쥬

        greeting1(1);
        // 안녕하세요


        // 첫번째는 언어, 두번째는 횟수를 의미

        greeting2(1, 3);
        // 안녕하세요
        // 안녕하세요
        // 안녕하세요

        greeting2(2, 5);
        // 하이~
        // 하이~
        // 하이~
        // 하이~
        // 하이~

        greeting2(3, 7);
        // 봉쥬
        // 봉쥬
        // 봉쥬
        // 봉쥬
        // 봉쥬
        // 봉쥬
        // 봉쥬
    }
}
