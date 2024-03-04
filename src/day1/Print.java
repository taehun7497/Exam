package day1;

public class Print {
    public static void main(String [] args) {
        // 숫자 출력
        System.out.println(100);
        System.out.println(200); //프로그램은 위에서 아래로 순차적 실행

        // 문자 출력
        System.out.println("김태훈");
        System.out.println("홍길동");

        // 숫자, 문자 아무거나 10개 출력
        System.out.print("생년 : ");
        System.out.println(1998);
        System.out.print("월 : ");
        System.out.println(6);
        System.out.print("일 : ");
        System.out.println(17);
        System.out.print("본거주지 : ");
        System.out.println("삼척시 도계읍");
        System.out.print("실거주지 : ");
        System.out.println("대전광역시 둔산동");
        System.out.println("안녕하세요.\n반갑습니다."); // \n은 줄바꿈

        //문자 합치기
        //System.out.println("안녕하세요." "김태훈입니다.");
        System.out.println("안녕하세요. 김태훈입니다.");
        System.out.println("안녕하세요." + " 김태훈입니다.");
        System.out.println("안녕하세요." + " 김태훈입니다." + " 반갑습니다.");

        //숫자 합
        System.out.println(100 + 200);
        System.out.println(2000 + 3000);

        //숫자와 문자는 확실히 구분하여 사용할 것
        System.out.println("100"); //문자
        System.out.println(100); //숫자
        System.out.println("100" + "200");
        System.out.println(100 + 200);

        //문자 + 숫자 => 숫자를 문자화해서 붙임
        System.out.println("100" + 200);

        //출력문을 이용해 더하기 식 표현하기
        System.out.println("100 + 200 = 300");
        // +연산자가 여러번 나오면 왼쪽부터 순차적을 연산
        System.out.println("165135 + 648124 = " + 165135 + 648124);
        //올바른 예시
        System.out.println("165135 + 648124 = " + (165135 + 648124));

        // 숫자 곱하기 (*)
        System.out.println(100 * 200);

        //구구단 2단을 출력
        System.out.println("2 * 1 = " + (2 * 1));
        System.out.println("2 * 2 = " + (2 * 2));
        System.out.println("2 * 3 = " + (2 * 3));
        System.out.println("2 * 4 = " + (2 * 4));
        System.out.println("2 * 5 = " + (2 * 5));
        System.out.println("2 * 6 = " + (2 * 6));
        System.out.println("2 * 7 = " + (2 * 7));
        System.out.println("2 * 8 = " + (2 * 8));
        System.out.println("2 * 9 = " + (2 * 9));
        System.out.println("2 X 1 = " + (2 * 1) + "\n2 X 2 = " + (2 * 2) + "2 X 3 = " + (2 * 3) + "\n2 X 4 = " + (2 * 4) + "2 X 5 = " + (2 * 5) + "\n2 X 6 = " + (2 * 6) + "2 X 7 = " + (2 * 7) + "\n2 X 8 = " + (2 * 8) + "\n2 X 9 = " + (2 * 9));

        for (int j = 1; j < 10; j++) {
            for (int i = 1; i < 19; i++) {
                i = i + 1;
                int answer = 0;
                answer = i;
                //System.out.println(answer = i);
                System.out.println("2 * " + (j) + " = " +(answer));
                }
            return;
            // System.out.println("2 * " + (j) " = "(answer)); "2 X 1 = " + (2 * 1) + "\n2 X 2 = " + (2 * 2)
            }
            return;
    }
}