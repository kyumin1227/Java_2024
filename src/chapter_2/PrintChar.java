package chapter_2;

public class PrintChar {
    public static void main(String[] args) {

        for (char bar = 'A'; bar <= 'Z'; bar += 2) {
            System.out.print(bar + "\t");
        }
        System.out.println();

        for (char bar = 'z'; bar >= 'a'; bar -= 1) {
            System.out.print(bar + "\t");
        }
    }
}
