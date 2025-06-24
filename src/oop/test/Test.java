package oop.test;

import java.io.IOException;
import java.util.ArrayList;

abstract class Animal {
    public String name;
    abstract void makeSound();
    void sleep() {
        System.out.println("자고 있다");
    }
}

class Dog extends Animal {

    Dog (String name) {
        this.name = name;
    }

    @Override
    void makeSound() {
        System.out.println("멍멍");
    }
}

class Cat extends Animal {

    Cat (String name) {
        this.name = name;
    }

    @Override
    void makeSound() {
        System.out.println("냥냥");
        throw new IllegalArgumentException("고양이는 울지 못합니다.");
    }
}

interface Device {
    int MAX = 100;                      // 상수 (자동으로 public static final)
    void start();                      // 추상 메서드 (자동으로 public abstract)

    default void info() {              // 디폴트 메서드
        System.out.println("정보 표시");
    }

    static void reset() {              // 정적 메서드
        System.out.println("리셋");
    }
}


public class Test {
    public static void main(String[] args) {

        Animal dog = new Dog("하찌");

//        dog.sleep();
//        dog.makeSound();

        Animal cat = new Cat("타마");

        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(dog);
        animals.add(cat);

        for (Animal animal : animals) {
            animal.sleep();
            try {
                animal.makeSound();
            } catch (IllegalArgumentException e) {
                System.out.println("예외 처리 IllegalArgumentException : " + e.getMessage());
            } catch (Exception e) {
                System.out.println("예외 처리 Exception : " + e.getMessage());
            }
            System.out.println(animal.name);
        }

//        cat.sleep();
//        cat.makeSound();

        Device.reset();


    }
}
