package oop.anonymousClass;

class Bar implements Runnable {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("* ");
                Thread.sleep(500);
            }
        } catch (Exception e) {

        }
    }
}

class Foo implements Runnable {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("- ");
                Thread.sleep(500);
            }
        } catch (Exception e) {

        }
    }
}

public class MainTest {
    public static void main(String[] args) {

        // Runnable 인터페이스를 구현한 익명 클래스
        Runnable bar = new Bar();
        Runnable foo = new Foo();

        // Thread 객체 생성
        Thread thread1 = new Thread(bar);
        Thread thread2 = new Thread(foo);

        // 스레드 시작
        thread1.start();
        thread2.start();

        // 익명 클래스 예제

//        1. class 이름 없음 extends Object {}
//        2. new 이름 없음();
        Object obj = new Object() {};

        interface Test {};

        // 1. class 이름 없음 implements Test {}
        // 2. new 이름 없음();
        Test test = new Test() {};

    }
}
