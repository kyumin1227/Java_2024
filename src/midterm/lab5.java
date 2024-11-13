package midterm;

import java.util.Scanner;

public class lab5 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기(N)를 입력하세요 (양수만 허용): ");
		
		int N = sc.nextInt();
		
		while (N < 1) {
			System.out.println("양수 값을 입력하세요.");
			System.out.print("배열의 크기(N)를 입력하세요 (양수만 허용): ");
			N = sc.nextInt();
		}

		int[] arr = new int[N];
		
		int start;
		int end;
		
		while (true) {
			
			System.out.print("난수 범위의 시작값(start)과 끝값(end)을 입력하세요: ");
			start = sc.nextInt();
			end = sc.nextInt();
			
			if ((end - start + 1) < N) {
				System.out.println("배열의 크기보다 큰 범위를 입력하세요.");
			} else {
				break;
			}
		}
		
		sc.close();
		
		for (int i = 0; i < N; i++) {
			arr[i] = (int) (Math.random() * (end - start + 1) + start);
		}
		
		System.out.println("생성된 배열 원소: ");
		
		for (int num : arr) {
			System.out.println(num);
		}
		
	}

}
