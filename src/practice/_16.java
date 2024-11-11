package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _16 {

    private static final List<Byte> COMPUTER_NUM = getComputerNum();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(COMPUTER_NUM);

        byte out = 0;

        for (int i = 0; i < 5; i++) {

            System.out.printf("시도 %d: 입력한 숫자 - ", i + 1);

            byte[] playerNum = new byte[3];

            playerNum[0] = sc.nextByte();
            playerNum[1] = sc.nextByte();
            playerNum[2] = sc.nextByte();

            byte[] result = checkNumber(playerNum); // [strike, ball]

            if (result[0] == 0 && result[1] == 0) {
                out += 1;
            }

            System.out.printf("결과: %d Strike, %d Ball, %d Out\n", result[0], result[1], out);

//            게임 결과 체크
            if (result[0] == 3) {
                System.out.println("게임 종료: 승리");
            } else if (out == 3) {
                System.out.println("게임 종료: 패배 (스트라이크 아웃)");
            } else if (i == 4) {
                System.out.println("게임 종료: 패배 (시도 횟수 5회 초과)");
            }

        }

        System.out.printf("정답: %d %d %d", COMPUTER_NUM.get(0), COMPUTER_NUM.get(1), COMPUTER_NUM.get(2));

    }

    /**
     * 0 ~ 9 사이의 중복되지 않는 정수 3개 생성
     * @return List<Byte>
     */
    private static List<Byte> getComputerNum() {

        List<Byte> list = new ArrayList<>();

        while (list.size() < 3) {
            Byte temp = (byte) (Math.random() * 9);

            if (!list.contains(temp)) {
                list.add(temp);
            }
        }

        return list;
    }

    private static byte[] checkNumber(byte[] playerNum) {

        byte[] result = new byte[2];

        for (int i = 0; i < 3; i ++) {
            if (COMPUTER_NUM.get(i).equals(playerNum[i])) {
                result[0] += 1;
            } else if (COMPUTER_NUM.contains(playerNum[i])) {
                result[1] += 1;
            }
        }

        return result;

    }
}
