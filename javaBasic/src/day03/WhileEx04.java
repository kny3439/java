package day03;

import java.util.Scanner;

public class WhileEx04 {

	public static void main(String[] args) {

		// 첫재줄에 n의 개수가 주어진다.
		// 그 다움줄 부터는 n번에 걸쳐서 입력을 받는다.

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int i = 1;
		while (i <= n) {
			int a = scan.nextInt();
			System.out.println(a);
			i++;
		}
		scan.close();
	}
}
