package oop.nestedClass;

class Outer {
    public static int x = 1;
    int outer_val = 10;

    public static class Nested {
        public void prt() {
            System.out.println("Nested class method called.");
            System.out.println("Outer.x = " + Outer.x);
        }

    }

    public class Inner {
        public void prt() {
            System.out.println("Inner class method called.");
            System.out.println(outer_val);
        }

        public void setOuterX(int x) {
            outer_val = x;
        }
    }
}

public class MainTest2 {
    public static void main(String[] args) {

        Outer.Nested nested = new Outer.Nested();
        Outer outer1 = new Outer();
        Outer outer2 = new Outer();
        Outer.Inner inner1 = outer1.new Inner();
        Outer.Inner inner2 = outer2.new Inner();
        Outer.Inner inner3 = outer2.new Inner();

        inner3.setOuterX(20);
        inner1.prt();
        inner2.prt();

    }
}
