package quiz01;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {

		// 두 정수 a b 를 한번에 입력받은 다음 a + b의 결과를 출력하는 프로그램 코드

		Scanner scan = new Scanner(System.in);

		System.out.println("a 의 값> ");
		int a = scan.nextInt();

		System.out.println("b 의 값> ");
		int b = scan.nextInt();

		System.out.println(a + "+" + b + "=" + (a + b));

		scan.close();

		Scanner plus = new Scanner(System.in);
		long A = plus.nextLong();
		long B = plus.nextLong();
		long C = plus.nextLong();

		System.out.print(A + B + C);
		plus.close();

	}
}
