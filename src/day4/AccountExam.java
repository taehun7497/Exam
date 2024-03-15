package day4;

public class AccountExam {
    public static void main(String[] args) {
        Account a1 = new Account();

        a1.deposit(1000); // 1000원을 예금했습니다.
        a1.deposit(2000); // 2000원을 예금했습니다.
        a1.deposit(3000); // 3000원을 예금했습니다.
        System.out.println();

        int money = a1.withdraw(1400);

        int remainder = a1.getRemainder();

        Account a2 = new Account();// 영희 계좌
        a2.deposit(1000);

        remainder = a1.getRemainder(); // 철수 계좌 잔액
        System.out.println(remainder);

        int remainder2 = a2.getRemainder(); // 영희 계좌 잔액
        System.out.println(remainder2);
    }
}
