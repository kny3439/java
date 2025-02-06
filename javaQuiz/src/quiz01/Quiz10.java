package quiz01;

import java.util.Scanner;

public class Quiz10 {

	public static void main(String[] args) {

		// 1. 1~입력받은 수 까지의 6의 배수의 합
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt(); // 100
		int i = 1;
		int sum = 0;
		while (i <= a) { // 1 <= 100
			if (i % 6 == 0) {
				sum += i;
			}
			i++;
		}
		System.out.println(sum);

		// 2. 1~100까지 정수 중에서 4의 배수이면서,
		// 8의 배수가 아닌수의 개수
		int b = 1;
		int c = 0;
		while (b <= 100) {
			if (b % 4 == 0 && b % 8 != 0) {
				c++;
			}

			b++;
		}
		System.out.println("c의 개수: " + c);

		// 3. 50~100까지 정수들의 합
		int d = 50;
		int sum2 = 0;
		while (d <= 100) {

			sum2 += d;
			d++;

		}
		System.out.println(sum2);

		// 4. 1000의 약수들의 개수
		int e = 1000;
		int f = 1;
		int g = 0;
		while (f <= e) {
			if (e % f == 0) {
				g++;
			}
			f++;
		}
		System.out.println("1000의 약수의 개수: " + g);

	}
}
