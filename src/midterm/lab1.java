package midterm;

import java.util.Scanner;

public class lab1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요: ");
		
		int inputAge = sc.nextInt();
		
		// 음수를 입력할 경우 재입력
		while (inputAge < 0) {
			System.out.println("나이는 음수가 될 수 없습니다. 다시 입력하세요.");
			System.out.print("나이를 입력하세요: ");
			inputAge = sc.nextInt();
		}
		
		sc.close();
		
		String answer;	// 결과로 출력할 문자
		
		if (inputAge <= 12) {
			answer = "어린이";
		} else if (inputAge <= 17) {
			answer = "청소년";
		} else if (inputAge <= 64) {
			answer = "성인";
		} else {
			answer = "노인";
		}
		
		System.out.println(answer);
		
	}

}
