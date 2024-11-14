package midterm;

import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[] operators = {'+', '-', '*'};	// + 43, - 45, * 42

        int score = 0;	// 점수
        char[] arr = new char[3];	// 랜덤 연산자
        int count = 0;	// 게임 횟수

        while (true) {

            count++;

            System.out.println(count + "번째 게임");
            System.out.print("게임을 시작하려면 아무 값이나 입력하세요");
            sc.nextLine();

            System.out.println("------------------------------");

            // 랜덤 연산자 생성
            for (int i = 0; i < 3; i++) {
                int randomNum = (int) (Math.random() * 3);
                arr[i] = operators[randomNum];

                // 결과 출력
                System.out.printf("    %s   :", arr[i]);
            }

            System.out.println("\n------------------------------");

            // 결과 확인
            char prev = arr[0];
            byte max = 1;

            for (int i = 1; i < 3; i++) {
                if (prev == arr[i]) {
                    max++;
                } else if (i == 1) {
                    prev = arr[i];
                }
            }

            // 점수 계산
            byte answer = switch (max) {

                case 3 -> {
                    if (prev == '*') yield 5;
                    else if (prev == '+') yield 3;
                    else yield -3;
                }

                case 2 -> {
                    if (prev == '*') yield 2;
                    else if (prev == '+') yield 1;
                    else yield -1;
                }

                default -> 0;
            };

            // 점수에 따른 출력
            if (answer > 0 ) {
                System.out.printf("%s %d Combo - 보너스 점수 %d점 획득\n", prev, max, answer);
            } else if (answer < 0) {
                System.out.printf("%s %d Combo - 보너스 점수 %d점 감점\n", prev, max, answer * -1);
            }

            score += answer;
            System.out.println("현재 점수 : " + score);

            // 게임 종료 조건 확인
            if (score >= 5) {
                System.out.print("승리! ");
                break;
            } else if (score <= -5) {
                System.out.print("패배, ");
                break;
            }

            System.out.println();
        }

        sc.close();

        System.out.println("최종 점수 : " + score);

    }

}
