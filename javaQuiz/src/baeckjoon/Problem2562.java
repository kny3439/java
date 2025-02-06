package baeckjoon;

import java.util.Scanner;

public class Problem2562 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] arr = new int[9];
		int max = arr[0];
		int cnt = 0;

		for (int i = 0; i < arr.length; i++) {
			int a = scan.nextInt();
			arr[i] = a;
			if (max < arr[i]) {
				max = arr[i];
				cnt = i;
			}

		}
		System.out.println(max);
		System.out.println(cnt + 1);

		scan.close();
	}
}
