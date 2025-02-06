package baeckjoon;

import java.util.Scanner;

public class Promblem1546 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int i = scan.nextInt();
		int[] arr = new int[i];
		double max = 0;

		for (int n = 0; n < arr.length; n++) {

			arr[n]= scan.nextInt();

			if (max < arr[n]) {
				max = arr[n];
			}

		}

		double sum = 0;
		for (int n = 0; n < arr.length; n++) {
			sum += arr[n] / max * 100;
		}
		System.out.println(sum/i);
		scan.close();
	
	}
}
