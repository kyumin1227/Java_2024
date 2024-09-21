package chapter_2;

import java.util.Scanner;

public class Lab4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt();
        System.out.print("몸무게를 입력하세요: ");
        double weight = sc.nextDouble();
        System.out.println("나이를 double로 변환한 후 몸무게와 더한 결과: " + ((double) age + weight));
        System.out.println("몸무게를 int로 변환한 후 나이와 더한 결과: " + (age + (int) weight));
    }
}
