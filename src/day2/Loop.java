package day2;

public class Loop {
    public static void main(String[] args) {

        //반복문을 이용해서 동일한 명령을 여러번 실행
//        while(true){
//            System.out.println("실행");
//        }

        //원하는 만큼만 반복
        int cnt = 0; //반복횟수 세는 용도

        while(cnt < 5){ // 5번 반복
            System.out.println("실행");
            cnt++;
        }

        // for 문

        for(int cnt2 = 0; cnt2 < 5; cnt2++){
            System.out.println("실행");
        }

        // 1부터 10까지 출력
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }

        // 1부터 10까지 짝수 출력 v1
        for(int i = 2; i <= 10; i+=2){
            System.out.println(i);
        }

        // 1부터 10까지 짝수 출력 v2
        for(int i = 1; i <= 10; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }

        // 1부터 10까지 4의 배수 출력
//      for(int i = 4; i <= 10; i+=4){
//            System.out.println(i);
//        }

        //증감 연산자
//        int num = 10;
//        System.out.println(num + 5);
//        System.out.println(num);
//
//        //변수의 값을 5증가시키고 싶다.
//        //num = 15; //증가 X
//        num = num + 5;
//        //num += 5;  //위와 같은표현
//
//        //변수의 값을 3 감소시키고 싶다
//        num = num - 3;
//        //num -= 3;  // 위와 같은표현
//
//        num += 1; //증가값이 1인 경우에 한해서는 num++ 라고 쓸 수 있다
//        num++; //위와 같은 표현
//
//
//        num -= 1;
//        num--;
//
//        System.out.println(num);
    }
}
