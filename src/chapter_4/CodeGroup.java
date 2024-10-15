package chapter_4;

public class CodeGroup {
    public static void main(String[] args) {

        int bar = 3;
        if (bar == 2) System.out.println("bar");
        System.out.println("foo");

        {
//            블럭이 닫히면 선언된 지역 변수는 소멸
            int foo = 5;
            System.out.println(foo);
        }

//        System.out.println(foo);
    }
}
