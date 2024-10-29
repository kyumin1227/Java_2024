package chapter_4;

import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        입력
        System.out.print("1~7 사이의 숫자를 입력하세요: ");
        int num = sc.nextInt();

        while (!(0 < num && num < 8)) {
            System.out.println("유효하지 않은 숫자입니다. 1~7 사이의 숫자를 입력하세요.");
            System.out.print("1~7 사이의 숫자를 입력하세요: ");
            num = sc.nextInt();
        }

        switch (num) {
            case 1:
                System.out.print("월요일, ");
                break;
            case 2:
                System.out.print("화요일, ");
                break;
            case 3:
                System.out.print("수요일, ");
                break;
            case 4:
                System.out.print("목요일, ");
                break;
            case 5:
                System.out.print("금요일, ");
                break;
            case 6:
                System.out.print("토요일, ");
                break;
            case 7:
                System.out.print("일요일, ");
        }

        switch (num) {
            case 1: case 2: case 3: case 4: case 5:
                System.out.println("주중");
                break;
            case 6: case 7:
                System.out.print("주말");
                break;
        }
    }
}
