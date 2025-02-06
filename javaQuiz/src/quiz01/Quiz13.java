package quiz01;

import java.util.Scanner;

public class Quiz13 {

	public static void main(String[] args) {

		// 7~100사이의 정수들 중 7의 배수를 가로로 출력
		System.out.print("7의 배수: ");
		for (int i = 7; i <= 100; i += 7) {
			System.out.print(i + " ");

		}

		System.out.println();

		// 200까지 정수 중 8의 배수의 개수를 출력
		int a = 0;
		for (int i = 1; i <= 200; i++) {
			if (i % 8 == 0) {
				a++;
			}
		}
		System.out.println("8의 배수의 개수: " + a);

		System.out.println("-----------------");

		// 50~100사이의 짝수의 합
		int sum = 0;
		for (int i = 50; i <= 100; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);

		// A~Z까지 문자열의 합 -> ABCDEFG....Z
		// A=65, Z=90
		String sum2 = "";
		for (char i = 'A'; i <= 'Z'; i++) {
			sum2 += i;
		}
		System.out.println(sum2);

		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String sum3 = "long";
		for (int i = 1; i <= n; i+=4) {
			
			System.out.print(sum3+" ");

		}
		System.out.print("int");

		scan.close();
	}
}
