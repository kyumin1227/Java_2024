package oop.nestedClass;

interface OuterInterface {
    void prt();
}

class Foo {}
class Bar {
    int x = 2;
    class Foo {
        int x = 3;

        void prt() {
            System.out.println("Bar.Foo.x = " + x);
            System.out.println("Bar.this.x = " + Bar.this.x);
        }
    }

    OuterInterface getLocalClass() {
        class LocalFoo implements OuterInterface {
            int x = 4;

            @Override
            public void prt() {
                System.out.println("LocalFoo.x = " + x);
                System.out.println("Bar.this.x = " + Bar.this.x);
            }
        }

        return new LocalFoo();
    }
}

public class MainTest {
    public static void main(String[] args) {

        Bar bar = new Bar();

        Bar.Foo foo = bar.new Foo();

        OuterInterface localClass = bar.getLocalClass();
        localClass.prt();
    }
}
