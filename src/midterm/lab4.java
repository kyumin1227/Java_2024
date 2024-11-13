package midterm;

import java.util.Scanner;

public class lab4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원소의 개수를 입력하세요 (1 이상 10 이하): ");
		
		int N = sc.nextInt();
		
		while (!(N >= 1 && N <= 10)) {
			System.out.println("1에서 10 사이의 값을 입력해주세요.");
			System.out.print("원소의 개수를 입력하세요 (1 이상 10 이하): ");
			N = sc.nextInt();
		}
		
		int[] arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			System.out.printf("%d번째 원소 값을 입력하세요: ", i + 1);
			arr[i] = sc.nextInt();
		}
		
		sc.close();
		
		System.out.print("입력된 원소: ");
		System.out.print(arr[0]);
		
		int maxNum = arr[0];
		int minNum = arr[0];
		int sum = arr[0];
		
		for (int i = 1; i < N; i++) {
			System.out.printf(", %d", arr[i]);
			
			maxNum = arr[i] > maxNum ? arr[i] : maxNum;
			minNum = arr[i] < minNum ? arr[i] : minNum;
			sum += arr[i];
			
		}
		
		System.out.printf("\n최대값: %d\n", maxNum);
		System.out.printf("최소값: %d\n", minNum);
		System.out.printf("평균: %.2f", (double) sum / N);
		
	}
 
}
