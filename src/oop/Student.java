package oop;

public class Student {
    int korean;
    int math;
    int english;
    int sum;
    final int NUMBER_OF_SUBJECT = 3;

    int id;
    String name;

    void setGrade(int korean, int math, int english) {
        this.korean = korean;
        this.math = math;
        this.english = english;
        this.sum = korean + math + english;
    }
}
