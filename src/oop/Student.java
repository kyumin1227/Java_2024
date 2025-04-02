package oop;

public class Student {
    int id;
    String name;
    int scoreKorean;
    int scoreMath;
    int scoreEnglish;
    int sum;
    float avg;

    int getSum() {
        sum = scoreKorean + scoreEnglish + scoreMath;
        return sum;
    }

    float getAvg() {
        avg = (float) getSum() / 3;
        return avg;
    }
}
