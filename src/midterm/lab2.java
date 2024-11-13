package midterm;

import java.util.Scanner;

public class lab2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~7 사이의 숫자를 입력하세요: ");
		
		int weekNum = sc.nextInt();
		
		while (!(weekNum > 0 && weekNum < 8)) {
			System.out.println("유효하지 않은 숫자입니다. 1~7 사이의 숫자를 입력하세요.");
			System.out.print("1~7 사이의 숫자를 입력하세요: ");
			weekNum = sc.nextInt();
		}
		
		sc.close();
		
		String dayOfWeek = null;
		
		switch (weekNum) {
		
		case 1:
			dayOfWeek = "월요일";
			break;
		case 2:
			dayOfWeek = "화요일";
			break;
		case 3:
			dayOfWeek = "수요일";
			break;
		case 4:
			dayOfWeek = "목요일";
			break;
		case 5:
			dayOfWeek = "금요일";
			break;
		case 6:
			dayOfWeek = "토요일";
			break;
		case 7:
			dayOfWeek = "일요일";
		}
		
		String dayType = null;
		
		switch (weekNum) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			dayType = "주중";
			break;
		case 6:
		case 7:
			dayType = "주말";
			break;
		}
		
		System.out.println(dayOfWeek + ", " + dayType);
		
	}

}
