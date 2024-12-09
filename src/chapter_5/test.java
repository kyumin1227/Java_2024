package chapter_5;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][][] boards = new int[0][][];
        int[] count = {};
        int n = 0;
        int m = 0;
        int start = 0;
        int selectNum, end;
        int width = 1;  // 빙고 숫자의 최대 길이

        while (true) {

            printMenu();
            selectNum = sc.nextInt();

//            4인 경우 종료
            if (selectNum == 4) {
                break;
            }

            switch (selectNum) {
                case 1:
                    int[] temp = inputParams(sc);
                    n = temp[0];
                    m = temp[1];
                    start = temp[2];
                    end = temp[3];
                    count = new int[end - start + 1];
                    int tempNum = 1;

                    while (true) {
                        if (end < Math.pow(10, tempNum)) {
                            width = tempNum;
                            break;
                        }
                        tempNum++;
                    }
                    boards = createBoard(n, m, start, end, count);
                    System.out.println("빙고 매트릭스가 생성되었습니다.\n");
                    break;

                case 2:
                    if (n == 0) {
                        System.out.println("빙고판이 생성되지 않았습니다.");
                    } else {
                        printCount(count, start, n * n * m);
                    }
                    break;

                case 3:
                    if (n == 0) {
                        System.out.println("빙고판이 생성되지 않았습니다.");
                    } else {
                        printBoard(boards, width);
                    }
                    break;

                default:
                    System.out.println("잘못된 입력입니다, 다시 입력해주세요");
            }

        }

    }

    /** 메뉴 출력 **/
    static void printMenu() {

        System.out.println("===== 빙고 게임 메뉴 =====");
        System.out.println("1. 빙고판 생성");
        System.out.println("2. 숫자별 발생 빈도 분석");
        System.out.println("3. 빙고판 출력");
        System.out.println("4. 종료");
        System.out.print("메뉴 선택: ");

    }

    /**
     * 생성할 보드판의 파라미터 입력
     * @return int[] = n, m, start, end
     */
    static int[] inputParams(Scanner sc) {

        int n, m, start, end;

//        n
        while (true) {
            System.out.print("빙고 매트릭스의 N 값을 입력하세요 (3 이상 9 이하 홀수): ");
            n = sc.nextInt();

            if (n >= 3 && n <= 9 && n % 2 == 1) break;
            System.out.println("N 값은 3이상 9이하 정수 중 홀수 값만 입력 가능합니다.");
        }

        while (true) {
            System.out.print("난수 범위의 시작값을 입력하세요: ");
            start = sc.nextInt();
            System.out.print("난수 범위의 종료값을 입력하세요: ");
            end = sc.nextInt();

            if (end - start + 1 >= n * n) break;
            System.out.println("종료 값 - 시작 값이 N x N 보다 크거나 같아야 합니다.");
        }

//        m
        while (true) {
            System.out.print("작성할 빙고 매트릭스 수 M을 입력하세요 (1 이상 7 이하): ");
            m = sc.nextInt();

            if (m >= 1 && m <= 7) break;
            System.out.println("M 값은 1이상 7이하 양수만 입력 가능합니다.");
        }

        int[] result = {n, m, start, end};
        return result;

    }

    /** 보드 생성 **/
    static int[][][] createBoard(int n, int m, int start, int end, int[] count) {

        int [][][] resultBoard = new int[m][][];
        int range = (int) Math.ceil((end - start + 1) / 32.0);

        for (int z = 0; z < m; z++) {

            int [][] tempBoard = new int[n][n];
            int[] bits = new int[range];

            for (int y = 0; y < n; y++) {

                for (int x = 0; x < n; x++) {

                    boolean isExist;
                    int randomNum;

//                    중복 여부 확인
                    do {
                        randomNum = (int) Math.floor(Math.random() * (end - start + 1)) + start;
                        isExist = checkNum(randomNum - start, bits);
                    } while (isExist);

                    tempBoard[y][x] = randomNum;
                    count[randomNum - start]++;

                }

            }

            resultBoard[z] = tempBoard;

        }

        return resultBoard;

    }

    /**
     * 숫자의 중복 여부 확인
     * @param randomNum randomNum - start
     * @param bits bits 배열
     * @return 존재할 경우 - true, 존재하지 않는 경우 - false
     */
    static boolean checkNum(int randomNum, int[] bits) {

        int targetBit = bits[randomNum / 32];
        int temp = targetBit >>> randomNum % 32;

//        비어 있는 경우
        if (temp % 2 == 0) {
            int mask = 1 << randomNum % 32;
            bits[randomNum / 32] |= mask;
            return false;
        } else return true;
    }

//    보드판 출력
    static void printBoard(int[][][] boards, int width) {

        System.out.println();

        for (int i = 0; i < boards.length; i++) {
            System.out.printf("빙고 매트릭스 #%d\n", i + 1);
            String format = " %0" + width + "d ";
            for (int[] line : boards[i]) {
                for (int num : line) {
                    System.out.printf(format, num);
                }
                System.out.println();
            }
            System.out.println();
        }
    }

//    발생 빈도 출력
    static void printCount(int[] count, int start, double sum) {

        System.out.println("\n===== 숫자별 발생 빈도 =====");

        for (int i = 0; i < count.length; i++) {
            System.out.printf("%d: %d회 (%.2f%%) ", i + start, count[i], count[i] / sum * 100);
            for (int star = 0; star < Math.ceil(count[i] / sum * 10); star++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}
