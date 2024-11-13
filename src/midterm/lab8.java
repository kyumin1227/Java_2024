package midterm;

import java.util.Scanner;

public class lab8 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int M;
		int N;
		
		while (true) {
			
			System.out.print("행의 개수(M)를 입력하세요: ");
			M = sc.nextInt();
			System.out.print("열의 개수(N)를 입력하세요: ");
			N = sc.nextInt();
			
			if (M > 0 && N > 0) {
				break;
			} else {
				System.out.println("M과 N은 1 이상의 양수여야 합니다. 다시 입력하세요.");
			}
			
		}
		
		sc.close();
		
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
