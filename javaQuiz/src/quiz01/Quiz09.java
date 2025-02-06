package quiz01;

import java.util.Scanner;

public class Quiz09 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int B = 1;

		while (B <= 9) {

			System.out.println(N + " * " + B + " = " + (N * B));
			B++;
		}

		scan.close();

//		Scanner r = new Scanner(System.in);
//		int t = r.nextInt();
//		int b = r.nextInt();
//		int c = r.nextInt();
//
//		while (0 < t) {
//
//			System.out.println(b + c);
//			
//		}
	}

}
