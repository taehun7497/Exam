package day2;

public class IncDecOperator {
    public static void main(String[] args) {

        //반복문을 이용해서 동일한 명령을 여러번 실행
//        while(true){
//            System.out.println("실행");
//        }

        //원하는 만큼만 반복
        int cnt = 0; //반복횟수 세는 용도

//        while(true){
//            System.out.println("실행");
//            cnt = 1;
//        }

        //증감 연산자
        int num = 10;
        System.out.println(num + 5);
        System.out.println(num);

        //변수의 값을 5증가시키고 싶다.
        //num = 15; //증가 X
        num = num + 5;
        //num += 5;  //위와 같은표현

        //변수의 값을 3 감소시키고 싶다
        num = num - 3;
        //num -= 3;  // 위와 같은표현

        num += 1; //증가값이 1인 경우에 한해서는 num++ 라고 쓸 수 있다
        num++; //위와 같은 표현


        num -= 1;
        num--;

        System.out.println(num);
    }
}
