package baeckjoon;

import java.util.Scanner;

public class Problem10811 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int lastNum = scan.nextInt();
		int[] arr = new int[lastNum];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;

		}

		int cnt = scan.nextInt();
		for (int j = 0; j < cnt; j++) {
			int n1 = scan.nextInt() - 1;
			int n2 = scan.nextInt() - 1;

			for (int i = n1; i <= n2; i++ ,n2--) {
				int temp = arr[i];
				arr[i] = arr[n2];
				arr[n2] = temp;
				
			}

		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		scan.close();
	}
}
