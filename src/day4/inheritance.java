package day4;

public class inheritance {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Dog d1 = new Dog();
        d1.bark();
        d1.breathe();

        Cat c1 = new Cat();
        c1.bark();
        c1.breathe();
    }
}

class Animal{
    public  void eat(){
        System.out.println("먹는다");
    }

    public void breathe(){
        System.out.println("숨을 쉰다~~!!`");
    }
}

class Dog extends Animal {
    public void bark(){
        System.out.println("멍멍");
    }
}

class Cat extends Animal {
    public void bark(){
        System.out.println("멍멍");
    }

    public void meow (){
        System.out.println("야옹");
    }
}