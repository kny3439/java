package baeckjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Problem10810 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = 0 ;
		}
		int m = scan.nextInt();
		for (int j = 0; j < m; j++) {
			int a = scan.nextInt() - 1;
			int b = scan.nextInt() -1;
			int num = scan.nextInt();
			
			for (int l = a; l <= b; l++) {
				arr[l]=num;
			}
			
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		scan.close();

	}
}
