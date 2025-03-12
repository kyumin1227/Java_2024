package oop;

class Car {
    String name;

    void printName() {
        System.out.println(name);
    }
}

class Bar {
    String name;

    Bar(String argName) {
        System.out.println("Bar 생성자 호출");
        this.name = argName;
    }

    void printInfo() {
        System.out.println(name);
    }
}

public class MainTest {
    public static void main(String[] args) {
        Bar b1 = new Bar("Bar1");
        b1.printInfo();
    }
}
