package chapter_5;

import java.util.Scanner;

public class TwoDimensional {
    static float[] getSumAvg(int a, int b, int c) {
        float result[] = new float[2];

        result[0] = a + b + c;
        result[1] = result[0] / 3;
        return result;
    }
    public static void main(String[] args) {

        int[][] bar = new int[3][3];

        // Loop: row 0 -> 2
        for(int row = 0, value = 10; row < bar.length; row++) {
            // Loop : col 0 -> 2
            for (int col = 0; col < bar[row].length; col++, value += 10) {
                bar[row][col] = value;
                System.out.print(value + " ");
            }
            System.out.println();
        }

        int[][] foo = new int[3][];
        foo[0] = new int[20];
        foo[1] = new int[40];

    }
}
