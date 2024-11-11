package chapter_4;

import java.util.Objects;
import java.util.Scanner;

public class Switch2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("Python");
                break;
            case 2:
                System.out.println("Java");
                break;
            case 3:
                System.out.println("C++");
                break;
            case 4:
                System.out.println("JavaScript");
                break;
        }
    }
}
