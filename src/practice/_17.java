package practice;

import java.util.*;

public class _17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] words = new String[3];
        String[] ordinal = {"첫", "두", "세"};

//        세 개의 단어를 입력 받음
        for (int i = 0; i < 3; i++) {
            System.out.printf("%s 번째 단어를 입력 하세요\n", ordinal[i]);
            String input = sc.nextLine().strip();

            while (!(input.length() >= 5 && input.length() <= 20)) {
                System.out.println("5 이상 20 이하 글자로 구성된 단어를 입력 하세요");
                input = sc.nextLine().strip();
            }

            words[i] = input;

        }

        byte selectWordIndex = (byte) (Math.random() * 3);  // 선택된 단어의 인덱스

        System.out.printf("단어 선택 완료 게임을 시작합니다. 선택한 단어: %s\n", words[selectWordIndex]);

//        선택된 단어를 char 리스트로 보존
        List<Character> selectWord = new ArrayList<>();
        for (char c :words[selectWordIndex].toCharArray()) {
            selectWord.add(c);
        }

        byte blind = (byte) Math.ceil(selectWord.size() / 2.0); // 가릴 단어 수

        Set<Byte> indexes = new HashSet<>();    // 가릴 단어 인덱스

        while (indexes.size() < blind) {
            byte tempIndex = (byte) (Math.random() * selectWord.size());
            indexes.add(tempIndex);
        }

        byte count = 0; // 시도 횟수

//        단어를 맞춰 가려진 단어 인덱스가 없을 때 까지 반복
        while (!indexes.isEmpty()) {
            count++;

            System.out.printf("%d번째 시도, 아래 단어를 구성하는 알파벳 한 개 입력하세요.\n", count);

//            인덱스에 포함된 단어를 가려서 출력
            for (byte i = 0; i < selectWord.size(); i++) {
                if (indexes.contains(i)) {
                    System.out.print("_");
                } else {
                    System.out.print(selectWord.get(i));
                }
            }
            System.out.println();

            byte exist = 0; // 존재하는 알파벳 수
            char alp = sc.nextLine().toCharArray()[0];

//            가려진 글자 중에 해당하는 알파벳이 있는지 확인
            for (byte i = 0; i < selectWord.size(); i++) {
                if (indexes.contains(i) && selectWord.get(i).equals(alp)) {
                    indexes.remove(i);
                    exist++;
                }
            }

            if (exist != 0) {
                System.out.printf("입력한 알파벳 단어 내 포함: %d글자\n", exist);
            }
        }

        System.out.printf("Clear - 선택된 단어: %s, 총 시도 횟수: %d", words[selectWordIndex], count);

    }
}
