package chapter_4;

import java.util.Scanner;
import java.util.Random;
public class Lab3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();


        while (true) {

            System.out.print("학생의 성적 등급을 입력하세요 : ");
            String alp = sc.next().toUpperCase();

            System.out.print("학생의 출석 등급을 입력합니다 : ") ;
            String chul = sc.next().toUpperCase();

            String answer = switch (alp) {
                case "A" -> {
                    if (chul.equals("EXCELLENT")) yield "good";
                    else yield "bad";
                }
                case "B" -> "아쉬움";
                default -> "나머지";
            };

            if (answer.equals("나머지")) {
                System.out.println("다시 입력");
            } else {
                break;
            }

        }


    }
}
