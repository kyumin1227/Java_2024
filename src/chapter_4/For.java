package chapter_4;

public class For {
    public static void main(String[] args) {

//        int bar = 0;
//        for(System.out.println("초기값"); bar < 2; System.out.println("증감값")) {
//            System.out.println("Hello world");
//            bar++;
//        }

//        for (int bar = 0, pos = 2; bar < 5; bar++, pos--) {
//            System.out.println(pos);
//        }

        for (char chValue = 'Z'; chValue >= 'A'; chValue -= 2) {
            System.out.println(chValue);
        }
    }
}
