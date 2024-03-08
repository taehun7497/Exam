package day5;

public class PersonExam {

    public void main(String[] args) {
        person p1= new person();
        p1.age= 10;
        p1.larm = new arm();

        System.out.println(p1.larm.length + "cm");
        // 출력 : 100cm

        new person().walk();
    }

    class person {
        int age;
        arm larm;
        void walk () {
            System.out.println("사람 걷는다.");
        }
    }

    class arm {
        int length = 100;
    }
}