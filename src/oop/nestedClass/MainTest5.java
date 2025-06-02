package oop.nestedClass;

interface myInterface {
    void prt();
}

class OuterA {
    int outerVal = 10;

    myInterface prtSomething() {
        class test implements myInterface {

            @Override
            public void prt() {
                int local = 20;
                System.out.println(outerVal + local);
            }
        }

        return new test();
    }

}

public class MainTest5 {
    public static void main(String[] args) {
        myInterface ifs = new OuterA().prtSomething();
        ifs.prt();
    }
}
