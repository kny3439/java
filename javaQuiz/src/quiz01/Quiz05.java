package quiz01;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {

		// 어떤 정수를 두개 입력 받는다.
		// A가 B 보다 큰 경우에는 A출력
		// B가 A 보다 큰 경우에는 B출력
		// A==B 일경우 "같은 수 입니다" 를 출력한다.

		Scanner scan = new Scanner(System.in);

		System.out.print("a>");
		int a = scan.nextInt();

		System.out.print("b>");
		int b = scan.nextInt();

		if (a > b) {
			System.out.println("a의 값:" + a);
		} else if (a < b) {
			System.out.println("b의 값:" + b);
		} else if (a == b) {
			System.out.println("같은 수 입니다^~^");
		}

		scan.close();

	}
}
