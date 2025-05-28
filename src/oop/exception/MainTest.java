package oop.exception;

class A {
    void prt() throws RuntimeException {}
}

class B extends A {
    @Override
    void prt() throws Error {}
}

public class MainTest {
    public static void main(String[] args) throws Exception {

        A a = new B();
    }
}
