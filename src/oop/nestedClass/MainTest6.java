package oop.nestedClass;

interface Test {
    void print();
}

class Outer2 {
    int outer_val = 2;

    Test prt() {
        int local_val = 3;

        class Inner implements Test {
            @Override
            public void print() {
                System.out.println("Outer value: " + outer_val);
                System.out.println("Local value: " + local_val);
            }
        }

        return new Inner();
    }
}

public class MainTest6 {
    public static void main(String[] args) {

        Outer2 outer = new Outer2();

        Test test = outer.prt();

        outer.outer_val = 3;

        test.print();
    }
}
