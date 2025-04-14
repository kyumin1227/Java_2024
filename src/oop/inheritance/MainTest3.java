package oop.inheritance;

class PrivateTest {
    private int x = 10;
}

class PrivateTest2 extends PrivateTest {

    void prt() {
        System.out.println("x = " + x); // private 멤버는 상속받지 못함
        System.out.println("x = " + super.x); // private 멤버는 상속받지 못함
    }
}

public class MainTest3 {
    public static void main(String[] args) {
        PrivateTest2 pt2 = new PrivateTest2();
        pt2.prt(); // private 멤버는 상속받지 못함
        // System.out.println(pt2.x); // private 멤버는 상속받지 못함
        // System.out.println(pt2.super.x); // private 멤버는 상속받지 못함
    }
}
