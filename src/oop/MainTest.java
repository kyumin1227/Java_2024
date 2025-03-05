package oop;

class Car {
    String name;

    void printName() {
        System.out.println(name);
    }
}

public class MainTest {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Car car1 = new Car();
        car1.name = "fasd";
        car1.printName();
    }
}
