package chapter_5;

import java.util.Scanner;

public class FinalExam {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int DEFAULT_SIZE = 2;

        int[][][] matrixs = new int[DEFAULT_SIZE][][];
        int size = 2;	// 매트릭스 배열 크기
        int matrix_len = 0;	// 매트릭스 개수
        int id = 1;
        int selectMenu;	// 메뉴 선택

        while (true) {

            printMenu(matrix_len);

            selectMenu = sc.nextInt();

//			범위 외의 숫자를 입력한 경우
            while (selectMenu <= 0 || selectMenu > 5) {
                System.out.println("메뉴 값은 1 ~ 5 사이 정수를 입력하세요!");
                selectMenu = sc.nextInt();
            }

//			종료
            if (selectMenu == 5) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            switch(selectMenu) {

//			매트릭스 생성
                case 1:
//				크기 확인
                    if (size == matrix_len) {
                        matrixs = expendMatrixs(matrixs);
                        size *= 2;
                    }

                    int[] temp = inputMatrixParam(sc);
                    int row = temp[0];
                    int col = temp[1];

                    int[][] matrix = createMatrix(row, col, id);

//				생성한 매트릭스 추가
                    matrixs[matrix_len] = matrix;
                    matrix_len++;
                    id++;
                    break;

//			매트릭스 출력
                case 2:
                    if (matrix_len == 0) {
                        System.out.println("생성된 매트릭스가 없습니다.");
                    } else {
                        printMatrixs(matrixs, matrix_len);
                    }
                    break;

//			2차원 매트릭스 출력
                case 3:
                    if (matrix_len == 0) {
                        System.out.println("생성된 매트릭스가 없습니다.");
                    } else {
                        int[][] twoDimensionMatrix = createTwoDimension(matrixs, matrix_len);
                        printTwoDimension(twoDimensionMatrix);
                    }
                    break;

//			매트릭스 삭제
                case 4:
                    if (matrix_len == 0) {
                        System.out.println("생성된 매트릭스가 없습니다.");
                    } else {
                        printMatrixsInfo(matrixs, matrix_len);
                        int deleteIndex = selectDeleteId(matrixs, sc, matrix_len);
                        deleteMatrix(matrixs, deleteIndex);
                        matrix_len--;
                    }
                    break;

            }

        }

    }


    //	메뉴 출력
    static void printMenu(int matrix_len) {

        System.out.println("===== 메뉴 =====");
        System.out.println("현재 매트릭스 수: " + matrix_len);
        System.out.println("1. 매트릭스 생성");
        System.out.println("2. 생성된 매트릭스 출력");
        System.out.println("3. 2차원 배열로 변환 후 출력");
        System.out.println("4. 매트릭스 삭제");
        System.out.println("5. 종료");
        System.out.println("메뉴 선택: ");

    }


    //	생성할 매트릭스의 행과 열을 입력
    static int[] inputMatrixParam(Scanner sc) {

        int row, col;

//		row
        while (true) {
            System.out.print("매트릭스의 행(row) 수를 입력하세요 (1~10): ");
            row = sc.nextInt();
            if (row >= 1 && row <= 10) break;
            System.out.println("입력 범위를 벗어났습니다, 다시 입력해주세요.");
        }

//		col
        while (true) {
            System.out.print("매트릭스의 열(col) 수를 입력하세요 (1~10): ");
            col = sc.nextInt();
            if (col >= 1 && col <= 10) break;
            System.out.println("입력 범위를 벗어났습니다, 다시 입력해주세요.");
        }

        int[] result = {row, col};
        return result;

    }


    //	매트릭스 생성
    static int[][] createMatrix(int row, int col, int id) {

        int[][] matrix = new int[row][col];

        matrix[0][0] = id;
        int num = id * 10;

        for (int i = 1; i < row * col; i++) {
            matrix[i / col][i % col] = num + i;
        }

        System.out.printf("매트릭스(ID: %d)가 생성되었습니다.\n\n", id);

        return matrix;

    }


    //	매트릭스 출력
    static void printMatrixs(int[][][] matrixs, int matrix_len) {

        System.out.println();

        for (int i = 0; i < matrix_len; i++) {

            int[][] matrix = matrixs[i];

            System.out.printf("매트릭스 (ID: %d):\n", matrix[0][0]);

            for (int[] line : matrix) {

                for (int num : line) {

                    System.out.print(" " + num + " ");
                }

                System.out.println();

            }

            System.out.println();

        }

    }


    //	매트릭스 확장
    static int[][][] expendMatrixs(int[][][] matrixs) {

        int [][][] newMatrixs = new int[matrixs.length * 2][][];

        for (int i = 0; i < matrixs.length; i++) {

            newMatrixs[i] = matrixs[i];

        }

        System.out.printf("매트릭스 배열의 크기를 %d에서 %d(으)로 확장합니다.\n", matrixs.length, newMatrixs.length);

        return newMatrixs;

    }


    //	매트릭스 출력 (삭제)
    static void printMatrixsInfo(int[][][] matrixs, int matrix_len) {

        System.out.println("현재 생성된 매트릭스 목록:");

        for (int i = 0; i < matrix_len; i++) {

            int[][] matrix = matrixs[i];

            System.out.printf("- 매트릭스 ID: %d, 행(row): %d, 열(col): %d, 총 원소 개수: %d\n", matrix[0][0], matrix.length, matrix[0].length, matrix.length * matrix[0].length);

        }

        System.out.println();

    }


    //	삭제할 매트릭스 ID 입력
    static int selectDeleteId(int[][][] matrixs, Scanner sc, int matrix_len) {

        int selectNum;
        int index = -1;

        while (true) {

            System.out.print("삭제할 매트릭스의 ID를 입력하세요: ");

            selectNum = sc.nextInt();

            for (int i = 0; i < matrix_len; i++) {

                int[][] matrix = matrixs[i];

                if (matrix[0][0] == selectNum) {
                    index = i;
                    break;
                }

            }

            if (index != -1) return index;

            System.out.println("잘못된 매트릭스 ID입니다. 다시 입력하세요.\n");

        }

    }


    //	매트릭스 삭제
    static void deleteMatrix(int[][][] matrixs, int targetIndex) {

        System.out.printf("매트릭스(ID: %d)가 삭제되었습니다.\n\n", matrixs[targetIndex][0][0]);

        for (int i = targetIndex; i < matrixs.length - 1; i++) {

            matrixs[targetIndex] = matrixs[targetIndex + 1];

        }

    }


    //	2차원 배열 생성
    static int[][] createTwoDimension(int[][][] matrixs, int matrix_len) {

        int size = 0;

        for (int i = 0; i < matrix_len; i++) {
            size += matrixs[i].length;
        }

        int[][] twoDimensionMatrixs = new int[size][];

        for (int newMatrixIndex = 0, matrixsIndex = 0; newMatrixIndex < size; matrixsIndex++) {

            int[][] matrix = matrixs[matrixsIndex];

            for (int[] line : matrix) {
                twoDimensionMatrixs[newMatrixIndex] = line;
                newMatrixIndex++;
            }

        }

        return twoDimensionMatrixs;

    }


    //	2차원 배열 출력
    static void printTwoDimension(int[][] twoDimensionMatrixs) {

        System.out.println("\n2차원 배열로 변환된 매트릭스:");

        for (int[] line : twoDimensionMatrixs) {

            for (int i = 0; i < line.length; i++) {

                System.out.print(" " + line[i] + " ");

            }

            System.out.println();

        }

        System.out.println();

    }

}
