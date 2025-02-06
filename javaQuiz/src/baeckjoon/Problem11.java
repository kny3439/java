package baeckjoon;

import java.util.Scanner;

public class Problem11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int answer = 0;

		for (int i = 0; number > 0; i++) {
			System.out.println(number);
			answer += number % 100;
			System.out.println(answer);
			number /= 100;
		}

		System.out.println(answer);

	}
}
