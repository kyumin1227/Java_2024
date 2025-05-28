package oop.tryWithResources;

import java.io.IOException;
import java.util.Scanner;

class Bar implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("Bar closed");
    }
}

public class MainTest {
    public static void main(String[] args) {
        try (Bar bar = new Bar()) {
            System.out.println("숫자를 입력하세요 (1: 정상 실행, 그외: IOException 발생)");
            int input = new Scanner(System.in).nextInt();

            if (input == 1) {
                System.out.println("try 블록 정상 실행");
            } else {
                throw new IOException("예외 발생: IOException");
            }

        } catch (IOException e) {
            System.out.println("catch - IOException: " + e.getMessage());

            for (Throwable supperessed : e.getSuppressed()) {
                System.out.println("Suppressed: " + supperessed);
            }

        } catch (Exception e) {
            System.out.println("catch - Exception: " + e.getMessage());
        }
    }
}
