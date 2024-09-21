package chapter_2;

import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("나이를 입력하세요: ");
        byte age = sc.nextByte();
        System.out.print("키를 입력하세요: ");
        float height = sc.nextFloat();
        System.out.print("신용점수를 입력하세요: ");
        short credit = sc.nextShort();

        System.out.println("합계: " + (age + height + credit));
        System.out.printf("평균: %.2f", (age + height + credit) / 3);
    }
}
