package chapter_3;

public class BitOperator {
    public static void main(String[] args) {

        int foo = 1;
        int bar = -1;

        System.out.println(Integer.toBinaryString(foo));
        System.out.println(Integer.toBinaryString(bar));

//        1
//        00000000 00000000 00000000 00000001
//        1의 보수 -> -1
//        11111111 11111111 11111111 11111110
//        2의 보수 + 1
//        11111111 11111111 11111111 11111111
    }
}
