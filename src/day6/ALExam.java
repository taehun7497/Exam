package day6;

import java.util.ArrayList;

// {5,4,3,2,1,0}을 ArrayList에 추가 해주세요.
// ArrayList의 사이즈를 출력해주세요.
// ArrayList의 3,4번째 값을 읽어서 출력해주세요. (인덱스 X, 1부터 )
// 1,2번째 값을 지운 뒤, 다시 3,4번째 값을 출력해주세요
// List의 모든 값을 출력해주세요.

public class ALExam {
    public static void main(String[] args) {
        // 정수를 저장할 수 있는 ArrayList를 선언하고 만들어주세요.
        // 리스트에 값을 추가해주세요.
        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(0);

        // size()
        // 리스트의 사이즈를 출력해주시고, 값이 6이 맞다면 계속 진행해주세요.
        // 출력결과 : 6
        System.out.println(list.size());

        // get()
        // 리스트의 3,4번째 값을 출력해주세요.
        // 출력결과 : 3, 2
        System.out.println(list.get(2));
        System.out.println(list.get(3));


        // remove()
        // 리스트의 1,2번째 값을 지운 뒤, 다시 3,4번째 값을 출력해주시고 어떤 변화가 있는지 체크해주세요.
        // 출력 결과 : 1, 0
        list.remove(0);
        list.remove(0);
        System.out.println(list.get(2));
        System.out.println(list.get(3));

        // 반복문으로 출력.
        // 리스트의 모든 값을 출력해주세요.
        // 출력 결과 : 3, 2, 1, 0

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


        사람 사람1 = new 사람(24, "홍길동");
        사람 사람2 = new 사람(30, "이순신");
        사람 사람3 = new 사람(41, "을지문덕");
        사람 사람4 = new 사람(32, "황진이");

        // 1. 네 사람을 ArrayList에 저장
        ArrayList<사람> 사람들 = new ArrayList<>();
        사람들.add(사람1);
        사람들.add(사람2);
        사람들.add(사람3);
        사람들.add(사람4);

        // 2. 네 사람에게 자기소개 시키기
        for (int i = 0; i < 사람들.size(); i++) {
//            사람 타겟 = 사람들.get(i);
//            타겟.introduce();
            사람들.get(i).introduce();
        }

//        for (사람 대상 : 사람들) {
//            대상.introduce();
//        }
        // 3. 30대인 사람에게만 자기소개 시키기
        // 향상된 반복문
        System.out.println("\n30대인 사람에게만 자기소개 시키기:");
        for (사람 대상 : 사람들) {
            if (대상.getAge() >= 30 && 대상.getAge() < 40) {
                대상.introduce();
            }
        }
    }
}

class 사람 {
    private int age;
    private String name;

    사람(int age, String name) {
        this.age = age;
        this.name = name;
    }

    void introduce() {
        System.out.printf("%d살 %s입니다.\n", age, name);
    }

    int getAge() {
        return this.age;
    }

    String getName() {
        return this.name;
    }
}
