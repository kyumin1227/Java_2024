package oop.inheritance;

class A2 {
    void prt() {
        System.out.println("안녕하세요");
    }
}

class B2 extends A2 {
    @Override
    void prt() {
        System.out.println("Hello");
    }
}

public class MainTest2 {
    public static void main(String[] args) {
        new B2().prt();
    }
}
