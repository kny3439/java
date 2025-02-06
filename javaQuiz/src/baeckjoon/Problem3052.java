package baeckjoon;

import java.util.Scanner;

public class Problem3052 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] arr = new int[42];
		int sum = 0;

		for (int i = 0; i < 10; i++) {
			int a = scan.nextInt();
			int b = a % 42;
			arr[b] = 1;

		}
		
		for(int j=0; j<arr.length; j++) {
			if(arr[j]==1) {
				sum++;
			}
		}

		System.out.println(sum );

	}
}
