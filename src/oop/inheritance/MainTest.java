package oop.inheritance;

class A {
    int a = 1;

    void prt() {
        System.out.println(a);
    }
}

class B extends A {
    int a = 2;
    int b = 4;

    void prt() {
        System.out.println(a);
        System.out.println(b);
    }
}

class C extends B {
    int a = 3;

    void prt() {
        System.out.println(a);
    }
}

public class MainTest {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        a.prt(); // 1
        b.prt(); // 2
        c.prt(); // 3

        A ab = new B();
        ab.prt(); // 2

        A ac = new C();
        ac.prt(); // 3

        B bc = new C();
        bc.prt(); // 3

        System.out.println("----------------------");

        System.out.println(ac.a); // 1
        System.out.println(((B) ac).a); // 2
        System.out.println(((C) ac).a); // 3
    }
}
