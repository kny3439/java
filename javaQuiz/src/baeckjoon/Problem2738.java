package baeckjoon;

import java.util.Scanner;

public class Problem2738 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result = 0;

		int[][] arr = new int[a][b];
		int[][] arr2 = new int[a][b];

		for (int i = 0; i < a; i++) {

			for (int j = 0; j < b; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < a; i++) {

			for (int j = 0; j < b; j++) {
				arr2[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < a; i++) {

			for (int j = 0; j < b; j++) {
				result = arr[i][j] + arr2[i][j];
				System.out.print(result + " ");
			}
			System.out.println();
		}

		sc.close();
	}
}
