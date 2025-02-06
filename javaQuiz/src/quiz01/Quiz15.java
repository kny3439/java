package quiz01;

import java.util.Scanner;

public class Quiz15 {

	public static void main(String[] args) {
		// 가로 세로 길이를 입력 받는다.
		// 가로 세로 길이의 사각형을 출력하면 된다.
		// 단, 윤곽만 나타나도록 출력하면 된다. // 힌트는 if 잘 생각

		Scanner scan = new Scanner(System.in);
		System.out.print("세로> ");
		int h = scan.nextInt();
		System.out.print("가로> ");
		int w = scan.nextInt();

		for (int i = 1; i <= h; i++) {

			for (int j = 1; j <= w; j++) {
				
				if (i == 1 || i == h || j == 1 || j == w) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.println();
		}
	}
}
