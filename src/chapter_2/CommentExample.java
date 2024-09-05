package chapter_2;

import java.util.Scanner;

public class CommentExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("출력할 구구단을 입력하세요: ");
        int tableNumber = sc.nextInt();

        /**
         * 입력된 숫자에 대해 구구단을 출력하는 반복문
         * 반복문은 1부터 9까지 순회하면서
         * 사용자가 입력한 숫자와 곱하여 결과를 출력
         */
        for (int multiplier = 1; multiplier <= 9; multiplier++) {
            System.out.println(tableNumber + " * " + multiplier + " = " + tableNumber * multiplier);
        }

        sc.close();
    }
}
