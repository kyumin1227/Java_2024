package chapter_5;

import java.io.IOException;
import java.util.Scanner;

public class Lab1 {

    static Scanner sc = new Scanner(System.in);
    static int studentLen = 0;

    public static void main(String[] args) throws IOException {


        final int DEFAULT_STUDENT_SIZE = 3;
        final int DEFAULT_ITEM_SIZE = 6;

        float[][] scores = new float[DEFAULT_STUDENT_SIZE][DEFAULT_ITEM_SIZE];

        String[] subject = {"국어", "영어", "수학"};

        int selectNum;

        while (true) {
            printMenu();

            System.out.print("선택: ");
            selectNum = sc.nextInt();

//            입력값이 4인 경우 종료
            if (selectNum == 4) {
                break;
            }

            switch (selectNum) {
                case 1:
                    System.out.print("학번을 입력하세요: ");
                    scores[studentLen][0] = sc.nextInt();
                    int sum = 0;
                    for (int i = 1; i < 4; i++) {
                        System.out.printf("%s 성적: ", subject[i - 1]);
                        scores[studentLen][i] = sc.nextInt();
                        sum += scores[studentLen][i];
                    }
                    scores[studentLen][4] = sum;
                    scores[studentLen][5] = sum / 3;
                    System.out.println("입력이 완료되었습니다.");
                    studentLen++;
                    break;

                case 2:
                    if (studentLen == 0) {
                        System.out.println("입력된 학생 정보가 없습니다.");
                    } else {
                        printScore(scores);
                    }
                    break;

                case 3:
                    if (studentLen == 0) {
                        System.out.println("입력된 학생 정보가 없습니다.");
                    } else {
                        deleteScore(scores);
                    }
                    break;

                default:
                    System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
            }

        }

        System.out.println("프로그램을 종료합니다.");

    }

    // 메뉴를 출력
    static void printMenu() {
        System.out.println("메뉴");
        System.out.println("1. 학생 성적 입력");
        System.out.println("2. 입력된 학생 목록 출력");
        System.out.println("3. 학생 삭제하기");
        System.out.println("4. 종료");
    }

//    학생 목록 출력
    static void printScore(float[][] scores) {
        System.out.println("학생 목록");
        for (int i = 0; i < studentLen; i++) {
            System.out.printf("[학번: %.0f] 국어: %.1f, 영어 %.1f, 수학: %.1f, 합계: %.1f, 평균: %.2f\n",
                    scores[i][0],
                    scores[i][1],
                    scores[i][2],
                    scores[i][3],
                    scores[i][4],
                    scores[i][5]);
        }
    }

//    학생 삭제 수행
    static void deleteScore(float[][] scores) {
        int targetIndex = -1;

        while (true) {
            printScore(scores);
            System.out.print("삭제할 학생의 학번을 입력하세요 (-1: 이전 메뉴로): ");
            float selectStudentNum = sc.nextInt();

//            -1을 선택한 경우 종료
            if (selectStudentNum == -1) {
                System.out.println("삭제 메뉴를 종료합니다.");
                return;
            }
    //        삭제할 학생이 있는지 검증
            for (int i = 0; i < studentLen; i++) {
                if (scores[i][0] == selectStudentNum) {
                    targetIndex = i;
                    break;
                }
            }

            if (targetIndex == -1) {
                System.out.println("해당 학번이 존재하지 않습니다. 다시 입력해주세요.");
            } else {
                if (targetIndex == studentLen - 1) {
                    scores[targetIndex] = new float[6];
                } else {
                    for (int i = targetIndex; i < studentLen; i++) {
                        scores[i] = scores[i + 1];
                    }
                }
                System.out.println("삭제가 완료되었습니다.");
                studentLen--;
                return;
            }

        }
    }
}
