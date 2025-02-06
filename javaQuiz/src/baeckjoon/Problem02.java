package baeckjoon;

import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();

		for (int i = 0; i < a; i++) {

			int n = scan.nextInt();
			int m = scan.nextInt();
			
			System.out.println("Case #"+(i+1)+": "+n+" + "+m +" = "+ (n+m));
		}
		
		scan.close();
	}
}
