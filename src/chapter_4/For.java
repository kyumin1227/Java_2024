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

//        for (char chValue = 'Z'; chValue >= 'A'; chValue -= 2) {
//            System.out.println(chValue);
//        }

//        for (int n = 1; n < 21; n++) {
//            if (n % 7 == 0) {
//                System.out.println(n);
//            }
//        }

//        for (int n = 10; n > 0; n--) {
//            System.out.print(n + " ");
//        }

        int[] bar = new int[3];

        for (int i = 0, j = 10; i < bar.length; i++, j += 10) {
            bar[i] = j;
        }

        for (int num : bar) {
            System.out.print(num + ", ");
        }
    }
}