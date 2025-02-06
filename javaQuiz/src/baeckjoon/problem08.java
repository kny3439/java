package baeckjoon;

import java.util.Scanner;

public class problem08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int h = scan.nextInt();
		int m = scan.nextInt();

		if (m >= 45) {
			m = m - 45;
		} else if (m < 45) {
			m = m + 15;
			h--;
			if(h<0) {
				h=23;
			}
		} else if (m == 0) {
			m = 45;

		}

		System.out.println(h + " " + m);
	}
}
