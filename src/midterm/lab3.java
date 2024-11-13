package midterm;

import java.util.Scanner;

public class lab3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생의 성적 등급을 입력하세요 (A, B, C, D, F): ");
		char score = sc.nextLine().toUpperCase().toCharArray()[0];
		System.out.print("학생의 출석 등급을 입력하세요 (Excellent, Average, Poor): ");
		String grade = sc.nextLine().strip().toUpperCase();
		
		while (!(score >= 65 && score <= 70 && score != 69) || !(grade.equals("EXCELLENT") || grade.equals("AVERAGE") || grade.equals("POOR"))) {
			System.out.println("잘못된 입력입니다. 다시 입력하세요.");
			
			System.out.print("학생의 성적 등급을 입력하세요 (A, B, C, D, F): ");
			score = sc.nextLine().toUpperCase().toCharArray()[0];
			System.out.print("학생의 출석 등급을 입력하세요 (Excellent, Average, Poor): ");
			grade = sc.nextLine().strip().toUpperCase();
			
		}
		
		sc.close();
		
		String answer = switch (score) {
		case 'A' -> {
			if (grade.equals("EXCELLENT")) yield "전액 장학금 및 추가 지원금 지급";
			else if (grade.equals("AVERAGE")) yield "전액 장학금";
			else yield "장학금 없음";
		}
		case 'B' -> {
			if (grade.equals("EXCELLENT")) yield "반액 장학금";
			else yield "장학금 없음";
		}
		case 'C' -> {
			if (grade.equals("POOR")) yield "장학금 없음, 재수강 권장";
			else yield "장학금 없음";
		}
		case 'D' -> {
			if (grade.equals("POOR")) yield "장학금 없음, 재수강 권장";
			else yield "장학금 없음";
		}
		case 'F' -> "장학금 없음, 재수강 권장";
		default -> "";
		};
		
		System.out.println("결과: " + answer);
		
	}

}
