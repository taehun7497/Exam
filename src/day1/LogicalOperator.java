package day1;

public class LogicalOperator {
    public static void main(String[] args) {
        //논리연산자

        // &&(and)
        // 둘다 참일때만 참
        System.out.println(true && true); //true
        System.out.println(true && false); //false
        System.out.println(false && true); //false
        System.out.println(false && false); //flase

        // ||(or)
        //둘다 false 일때만 false (한쪽만 참이여도 참)
        System.out.println(true || true); //true
        System.out.println(true || false); //true
        System.out.println(false || true); //true
        System.out.println(false || false); //false

        //연속된 논리연산일 경우 앞에서 부터 계산
        /*System.out.println(true || false || true || false); //true
        System.out.println(true || true || false);
        System.out.println(true || false);
        System.out.println(true);*/

        System.out.println(10 > 20 && 1 != 1 && 3 > 2); //false
    }
}
