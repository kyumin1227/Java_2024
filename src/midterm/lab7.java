package midterm;

import java.util.Scanner;

public class lab7 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int score = 0;
		boolean prevWin = false;
		int computerSelectNum;
		int result;
		
		System.out.println("가위바위보 게임에 오신 것을 환영합니다!");
		
		String[] rspArr = {"scissors", "rock", "paper", "quit"};
		
		while (true) {
			System.out.print("Scissors, Rock, Paper 중 하나를 선택하세요 (종료는 quit) : ");
			
			String userInput = sc.nextLine().strip().toLowerCase();
			int userSelectNum = 4;
			
			for (int i = 0; i < 4; i++) {
				if (userInput.equals(rspArr[i])) {
					userSelectNum = i;
				}
			}
			
			if (userSelectNum == 3) {
				break;
			} else if (userSelectNum == 4) {
				System.out.println("잘못된 입력입니다. Scissors, Rock, Paper 중 하나를 입력하세요.");
				continue;
			}
			
			computerSelectNum = (int) (Math.random() * 3);
			
			System.out.printf("컴퓨터의 선택: %s\n", rspArr[computerSelectNum]);
			System.out.printf("당신의 선택: %s\n", rspArr[userSelectNum]);
			
			result = userSelectNum - computerSelectNum;
			
			if (result == 0) {
				System.out.println("비겼습니다!");
			} else if (result == 1 || result == -2) {
				System.out.println("축하합니다! 당신이 이겼습니다!");
				score += prevWin ? 3 : 1;
				prevWin = true;
			} else {
				System.out.println("아쉽네요. 컴퓨터가 이겼습니다.");
				score--;
				prevWin = false;
			}
			
			System.out.println("현재 보너스 점수: " + score);
			
			if (score >= 7) {
				System.out.printf("사용자 승리: 보너스 점수 %d점\n", score);
				break;
			} else if (score <= -7) {
				System.out.printf("사용자 패배: 보너스 점수 %d점\n", score);
				break;
			}
			
		}
		
		sc.close();
		
		System.out.println("게임을 종료합니다. 감사합니다!");
	}

}
