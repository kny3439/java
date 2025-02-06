package baeckjoon;

import java.util.Scanner;

public class Problem2292 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int cnt = 1;
		int two = 2;

		// 남은 부분에서 6 * num 추출

		if (num == 1) {
			System.out.println(1);
		} else {

			while (two <= num) {
				two = two + (6 * cnt);
				cnt++;
			}
			System.out.println(cnt);
		}

		sc.close();
	}
}
