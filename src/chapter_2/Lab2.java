package chapter_2;

public class Lab2 {
    public static void main(String[] args) {

        byte maxValue = 127;
        byte minValue = -128;

        maxValue++; // byte의 최대 값을 넘어서서 byte의 최소값이 된다.
        minValue--; // byte의 최소 값을 넘어서서 byte의 최대값이 된다.

        System.out.println("오버플로우된 값: " + maxValue);
        System.out.println("언더플로우된 값: " + minValue);
    }
}
