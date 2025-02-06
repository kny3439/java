package baeckjoon;

import java.util.Scanner;

public class Problem10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		int max = a;

		if (a == b && b == c) {
			
			System.out.println(10000 + (max * 1000));
			
		} else if (a == b || b == c || a == c) {

			if (a == b) {
				max = a;
			} 
			if (b == c) {
				max = b;
			}
			if (a == c) {
				max = c;
			}
			System.out.println(1000 + (max * 100));
		} else {
			if (b > max) {
				max = b;
			}
			if (c > max) {
				max = c;
			}
			System.out.println(max * 100);
		}
		scan.close();

	}
}
