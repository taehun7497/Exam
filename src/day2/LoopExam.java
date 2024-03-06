package day2;

import javax.management.MBeanAttributeInfo;

public class LoopExam {

    //문제 : 1부터 100까지 출력해주세요.
    /*
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++){
            System.out.println(i);
        }
    }
    */
    //문제1. 1 ~ 100까지 수중 짝수만 출력
    /*
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
    */
    //문제1. 1 ~ 100까지 수를 출력하는데 숫자 뒤에 짝수는 even, 홀수는 odd를 붙여서 출력
    /*
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++){
            if(i % 2 == 1){
                System.out.println(i + " odd");
            }
            else{
                System.out.println(i + " even");
            }
        }
    }
    */
    /*
    축구 경기가 진행중입니다. 축구경기 타임은 총 90분이고,
    현재 A팀이 0점, B팀이 2점인 상황에서, A팀은 최고의 스트라이커인 손흥민을 투입하기로 결정했다.
    손흥민은 투입과 동시에 그리고 5분마다 골을 넣을 수 있는 능력을 가지고 있다.
    만약 80분에 투입이 되면 80분에 곧바로 골을 넣게되고 85분에 골을 넣음으로서 동점이 가능하게 된다.
    (90분이되면 경기가 바로 종료되므로 골을 넣을 수 없다. 해당 경기의 심판은 추가시간을 주지 않는 것으로 유명하다.)
    현재 경기타임 time과 A팀의 득점 score가 주어질 때, 손흥민을 투입하면 A팀의 최종 득점은 몇 점인지 출력하시오.
    */
    /*
    public static void main(String[] args) {
        int time = 74;
        int score = 0;

        for (time = 74; time <= 90; time++) {
            if (time % 5 == 4) {
                score++;
            }
            System.out.println(score);
        } // 출력 : 4
    }
    */

    // a b 두 수가 주어지면 a와 b사이의 수를 오름차순 출력해주세요.
    // 오름차순은 작은 수 부터 큰수로 정렬되는 것을 말합니다.
    /*
    public static void main(String[] args) {
        int a = 12;
        int b = 5;
        //오름차순
        for(b = 5; b <= a; b++){
            System.out.println(b);
        }
    }
    public static void main(String[] args) {
        int a = 12;
        int b = 5;
        //내림차순
        for(a = 12; a >= b; a--){
            System.out.println(a);
        }
    }
    */
    // 문제 : 구구단 작성
    // 조건 : 짝수번째만 곱하기
    /*
    public static void main(String[] args) {
        for(int i = 2; i <= 10; i ++){
            for(int j = 2; j < 10; j += 2){
                System.out.println(i + " X " + j + " = " + (i * j));
            }
        }
    }
    */

    /*
    //구구단은 n단 ~ m단 중 홀수단만 1 ~ limit 까지 곱 중 짝수곱만 출력해주세요.
    public static void main(String[] args) {
        int n = 4; // 시작
        int m = 20; // 끝
        int limit = 10; // 곱의 개수

        for(int i = 4; i <= 20; i ++){
            for(int j = 2; j < 11; j += 2){
                System.out.println(i + " X " + j + " = " + (i * j));
            }
        }
    }
    */
        /*
        public static void main(String[] args) {
        int k = 3; //크기 조절
        for (int i = 1; i <= k; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        */
    /*
    public static void main(String[] args) {
        int tri = 7;  //크기 조절
        for (int i = 0; i < tri; i++) {// 공백 출력
            for (int j = 0; j < tri - i - 1; j++) {
                System.out.print(' ');
            }
            // 별표 출력
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print('*');
            }
            // 다음 줄로 이동
            System.out.println();
        }
    }
    */

    /*
    public static void main(String[] args) {
        int y = 3; //크기 조절

        for (int i = 0; i < y; i++) {
            // 공백 출력
            for (int j = 0; j < y - i - 1; j++) {
                System.out.print(" ");
            }
            // 별표 출력
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            // 다음 줄로 이동
            System.out.println();
        }
    }
    */
}