package oop;

public class MainTest {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.id = 1;
        s1.name = "홍길동";
        s1.scoreKorean = 90;
        s1.scoreMath = 80;
        s1.scoreEnglish = 70;
        System.out.println(s1.getSum());
        System.out.println(s1.getAvg());
    }
}
