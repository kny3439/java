package quiz01;

import java.util.Scanner;

public class Quiz6_5 {

	public static void main(String[] args) {

		Scanner a = new Scanner(System.in);
		int x = a.nextInt();
		int y = a.nextInt();

		if (x > 0 && y > 0) {
			System.out.println(1);
		} else if (x < 0 && y > 0) {
			System.out.println(2);
		} else if (x < 0 && y < 0) {
			System.out.println(3);
		} else if (x > 0 && y < 0) {
			System.out.println(4);
		}

		a.close();

	}
}
