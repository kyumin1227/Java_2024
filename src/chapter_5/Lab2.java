package chapter_5;

import java.io.IOException;
import java.util.Scanner;

public class Lab2 {

    static Scanner sc = new Scanner(System.in);
    static int scoresSize = 3;
    static final int DEFAULT_ITEM_SIZE = 6;
    static float[][] scores = new float[scoresSize][DEFAULT_ITEM_SIZE];
    static int studentLen = 0;

    public static void main(String[] args) throws IOException {

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
//                    학생 수가 배열의 크기와 같은 경우 배열 확장
                    if (studentLen == scoresSize) {
                        expansionSize();
                    }
                    while (true) {
                        System.out.print("학번을 입력하세요: ");
                        float inputStudentNum = sc.nextInt();
                        int result = appendScoreCheck(inputStudentNum);

//                        결과가 -1인 경우 종료
                        if (result == -1) {
                            System.out.println("입력이 취소되었습니다. 메뉴로 돌아갑니다.");
                            break;
                        }
//                        결과가 -2인 경우 학번 입력부터 다시 실행
                        else if (result == -2) {
                            System.out.println("잘못된 입력입니다.");
                        } else {
                            break;
                        }
                    }
                    break;

                case 2:
                    if (studentLen == 0) {
                        System.out.println("입력된 학생 정보가 없습니다.");
                    } else {
                        printScore();
                    }
                    break;

                case 3:
                    if (studentLen == 0) {
                        System.out.println("입력된 학생 정보가 없습니다.");
                    } else {
                        deleteScore();
                    }
                    break;

                default:
                    System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
            }

        }

        System.out.println("프로그램을 종료합니다.");

    }

    // 메뉴 출력
    static void printMenu() {
        System.out.println("메뉴");
        System.out.println("1. 학생 성적 입력");
        System.out.println("2. 입력된 학생 목록 출력");
        System.out.println("3. 학생 삭제하기");
        System.out.println("4. 종료");
    }

    // 학생 목록 출력
    static void printScore() {
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

    // 학생 삭제
    static void deleteScore() {
        int targetIndex = -1;

        while (true) {
            printScore();
            System.out.print("삭제할 학생의 학번을 입력하세요 (-1: 이전 메뉴로): ");
            float selectStudentNum = sc.nextInt();

//            -1을 선택한 경우 종료
            if (selectStudentNum == -1) {
                System.out.println("삭제 메뉴를 종료합니다.");
                return;
            }

//            학생이 존재하는지 확인
            targetIndex = checkStudentNum(selectStudentNum);

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

//    학번의 존재 여부 확인
    static int checkStudentNum(float target) {
        for (int i = 0; i < studentLen; i++) {
            if (scores[i][0] == target) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 추가할 학번을 확인
     * @return q == -1, 학번 재입력 == -2, 그외 추가한 인덱스
     */
    static int appendScoreCheck(float studentNum) {
        int targetIndex = checkStudentNum(studentNum);
//                    입력하는 학번이 존재하지 않는 경우
            if (targetIndex == -1) {
                appendScore(studentNum, studentLen);
                System.out.println("입력이 완료되었습니다.");
                studentLen++;
                return studentLen;
            } else {
                System.out.println("중복된 입력이 있습니다.");
                System.out.print("덮어쓰기를 희망합니까? (Y: 덮어쓰기 진행, q: 메뉴로 돌아가기): ");
                String copySelect = sc.next().strip();

                if (copySelect.equals("Y")) {
                    appendScore(studentNum, targetIndex);
                    System.out.println("덮어쓰기가 완료되었습니다.");
                    return targetIndex;
                } else if (copySelect.equals("q")) {
                    return -1;
                } else {
                    return -2;
                }
            }
    }

//    학번과 인덱스를 받아 성적을 입력받는 함수
    static void appendScore(float studentNum, int index) {
        String[] subject = {"국어", "영어", "수학"};
        scores[index][0] = studentNum;
        int sum = 0;
        for (int i = 1; i < 4; i++) {
            System.out.printf("%s 성적: ", subject[i - 1]);
            scores[index][i] = sc.nextInt();
            sum += scores[index][i];
        }
        scores[index][4] = sum;
        scores[index][5] = sum / 3;
    }

//    배열 확장 함수
    static void expansionSize() {
        scoresSize *= 2;

        float[][] temp = new float[scoresSize][DEFAULT_ITEM_SIZE];

        for (int i = 0; i < studentLen; i++) {
            temp[i] = scores[i];
        }

        scores = temp;
        System.out.printf("배열이 확장되었습니다. 새로운 크기: %d행\n", scoresSize);
    }
}
