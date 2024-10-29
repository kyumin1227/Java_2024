package chapter_4;

import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt();

//        음수일 경우 재입력 받음
        while (age < 0) {
            System.out.println("나이는 음수가 될 수 없습니다. 다시 입력하세요.");
            System.out.print("나이를 입력하세요: ");
            age = sc.nextInt();
        }

        if (age <= 12) {
            System.out.println("어린이");
        } else if (age <= 17) {
            System.out.println("청소년");
        } else if (age <= 64) {
            System.out.println("성인");
        } else {
            System.out.println("노인");
        }


    }
}
