package baeckjoon;

import java.util.Scanner;

public class problem01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int n = scan.nextInt();

		int i = 1;
		while (i <= n) {
			int a = scan.nextInt();
			int b = scan.nextInt();

			x = x - (a * b);
			
			i++;
		}
		if(x==0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}
}
