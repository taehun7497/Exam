package day2;

public class DoubleLoop {
    public static void main(String[] args) {
        /*for(int i = 1; i <= 5; i++){
            System.out.println(i);
        }

        for(int i = 1; i <= 5; i++){
            System.out.println(i);
        }

        for(int i = 1; i <= 5; i++){
            System.out.println(i);
        }

        for(int i = 1; i <= 3; i++){
            System.out.println("실행");
        }

        for(int i = 0; i < 3; i++){
            for(int j = 1; j <= 5; j++){
                System.out.println(j);
            }
        }

        //구구단 2 ~ 9단까지

        for(int i = 1; i <= 9; i++){
            System.out.println("2 X " + i + " = " + (2 * i));
        }

        for(int i = 1; i <= 9; i++){
            System.out.println("3 X " + i + " = " + (3 * i));
        }

        for(int i = 1; i <= 9; i++){
            System.out.println("4 X " + i + " = " + (4 * i));
        }

        for(int i = 1; i <= 9; i++){
            System.out.println("5 X " + i + " = " + (5 * i));
        }

        for(int i = 1; i <= 9; i++){
            System.out.println("6 X " + i + " = " + (6 * i));
        }

        for(int i = 1; i <= 9; i++){
            System.out.println("7 X " + i + " = " + (7 * i));
        }

        for(int i = 1; i <= 9; i++){
            System.out.println("8 X " + i + " = " + (8 * i));
        }

        for(int i = 1; i <= 9; i++){
            System.out.println("9 X " + i + " = " + (9 * i));
        }
        int dan = 2;
        while (dan <= 9) {
            for (int i = 1; i <= 9; i++) {
                System.out.println(dan + " X " + i + " = " + (dan * i));
            }
            dan++;
        }*/

        int j = 2;
        for( j = 2; j < 10; j++) {
            for (int i = 1; i <= 9; i++) {
                System.out.println(j + " X " + i + " = " + (j * i));
            }
        }
        /*for(int j = 0; j < 8; j++){
            for(int i = 1; i <= 9; i++){
                System.out.println("2 X " + i + " = " + (2 * i));
            }
        }*/


    }
}
