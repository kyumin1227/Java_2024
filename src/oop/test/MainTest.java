package oop.test;

class Bar {

    int myId;
    static int value;
    static int count;

    void setValue(int argValue) {
        value = argValue;
    }

    Bar() {
        myId = count++;
    }
}

public class MainTest {
    public static void main(String[] args) {
        Bar b1 = new Bar();
        Bar b2 = new Bar();
        Bar b3 = new Bar();

        b3.setValue(10);

        System.out.println(b1.myId + ":" + b1.value);
        System.out.println(b2.myId + ":" + b2.value);
        System.out.println(b3.myId + ":" + b3.value);
    }
}
