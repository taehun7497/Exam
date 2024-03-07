package day4;

//public class Account {
//    int balance = 0;
//
//    public void deposit(int amount) {
//        balance += amount;
//        System.out.println(amount + "원을 예금했습니다.");
//        System.out.println("잔액: " + balance + "원");
//    }
//
//    public int withdraw(int amount) {
//        balance -= amount;
//        System.out.println(amount + "원을 출금했습니다.");
//        System.out.println("잔액: " + balance + "원");
//        return amount;
//    }
//
//    public int getRemainder() {
//        return balance;
//    }
//}

//public class Account {
//    int remainder = 0;
//    public void deposit(int depositMoney){
//        remainder += depositMoney;
//        System.out.println(depositMoney + "원을 예금했습니다.");
//        System.out.println("잔액: " + remainder + "원");
//    }
//
//    public int withdraw(int withdrawMoney){
//        remainder -= withdrawMoney;
//        return withdrawMoney;
//    }
//
//    public int getRemainder(){
//        return remainder;
//    }
//}

public class Account {
    int lastmoney = 0;

    public void deposit(int plusmoney){
        lastmoney += plusmoney;
        System.out.println();
        System.out.println(plusmoney + "원을 예금했습니다.");
        System.out.println("잔액: " + lastmoney + "원");
    }

    public int withdraw(int minusmoney){
        lastmoney -= minusmoney;
        return minusmoney;
    }

    public int getRemainder(){
        return lastmoney;
    }
}