package chapter_4;

import java.util.Scanner;

public class Switch_OOP {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        MyClass value = switch (num) {
            case 1 -> new MyClass(4);
            default -> new MyClass(4.0);
        };

    }
}

class MyClass {




    MyClass(int num) {

    }

    MyClass(double num) {

    }

}
