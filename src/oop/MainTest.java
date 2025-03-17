package oop;

class Bar {

    void prtMsg() {
        System.out.println(1);
    }

    void prtMsg(String msg) {
        System.out.println(2);
    }

    void prtMsg(String msg, int num) {
        System.out.println(3);
    }

    void prtMsg(int num, String msg) {
        System.out.println(4);
    }

}

public class MainTest {
    public static void main(String[] args) {
        Bar bar = new Bar();
        bar.prtMsg();
        bar.prtMsg("Hello");
        bar.prtMsg("Hello", 1);
        bar.prtMsg(1, "Hello");
    }
}
