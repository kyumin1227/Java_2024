package practice;

import java.util.List;
import java.util.Scanner;

public class _15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        byte player = 0;
        byte computer = 0;
        byte draw = 0;

        List<String> LIST = List.of("가위", "바위", "보");

        while (player < 3 && computer < 3) {
            System.out.print("가위, 바위, 보 중 하나를 입력하세요: ");

            String input = sc.nextLine().strip();

            if (!LIST.contains(input)) {
                System.out.println("가위, 바위, 보 중에서 선택하세요.");
                continue;
            }

            byte playerSelect = (byte) LIST.indexOf(input);
            byte computerSelect = (byte) (Math.random() * 3);

            System.out.println("컴퓨터: " + LIST.get(computerSelect));

            byte answer = (byte) (playerSelect - computerSelect);

            if (answer == 0) {
                System.out.print("무승부! ");
                draw += 1;
            } else if (answer == 1 || answer == -2) {
                System.out.print("승리! ");
                player += 1;
            } else {
                System.out.print("패배! ");
                computer += 1;
            }

            System.out.printf("현재 전적: %d승 %d패 %d무\n", player, computer, draw);

        }

        sc.close();

        System.out.printf("전적: %d승 %d패 %d무\n", player, computer, draw);
        System.out.printf("최종 승자: %s", (player == 3) ? "사용자" : "컴퓨터");
    }
}
