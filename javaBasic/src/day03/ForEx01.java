package day03;

import java.util.Scanner;

public class ForEx01 {

	public static void main(String[] args) {

		// 1~10까지의 합 for
		int sum = 0;

		for (int i = 1; i <= 10; i++) {
			sum += i;

		}
		System.out.println("1~10까지의 합: " + sum);

		System.out.println("------------------------");

		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}

		System.out.println("------------------------");

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		for (int i = 1; i <= 9; i++) {
			
			System.out.println(num + "*" + i + "=" + num * i);
		}

	}

}
