package day3;

public class ParameterExam {

    public static void print(int num){
        System.out.println(num);
    }

//    public static void introduce() {
//        for(int i = 0; i < 10; i++){
//            System.out.println("안녕하세요. 저는 20살 홍길동입니다.!");
//        }
//    }
    public static void introduce(int num) {
        for(int i = 0; i < num; i++){
            System.out.println("안녕하세요. 저는 20살 홍길동입니다.!");
        }
    }

    public static void main(String[] args) {
        print(4); // 출력: 4
        print(10); // 출력: 10
        print(100); // 출력: 100

//        introduce();
        // 안녕하세요. 저는 20살 홍길동입니다.!
        // 안녕하세요. 저는 20살 홍길동입니다.!
        // 안녕하세요. 저는 20살 홍길동입니다.!
        // 안녕하세요. 저는 20살 홍길동입니다.!
        // 안녕하세요. 저는 20살 홍길동입니다.!
        // 안녕하세요. 저는 20살 홍길동입니다.!
        // 안녕하세요. 저는 20살 홍길동입니다.!
        // 안녕하세요. 저는 20살 홍길동입니다.!
        // 안녕하세요. 저는 20살 홍길동입니다.!
        // 안녕하세요. 저는 20살 홍길동입니다.!
        introduce(3);
        System.out.println();
        introduce(5);
        System.out.println();
        introduce(10);
    }


}
