package baeckjoon;

import java.util.Scanner;

public class Problem5086 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int i = 1;
		while (true) {

			int a = sc.nextInt();
			int b = sc.nextInt();

			if (a * i == b) {
				System.out.println("factor");

				break;
			}
			i++;

			if (a == 0 && b == 0) {
				break;
			} else if (b % a == 0) {
				System.out.println("multiple");
			} else {
				System.out.println("neither");
			}

		}
	}
}
