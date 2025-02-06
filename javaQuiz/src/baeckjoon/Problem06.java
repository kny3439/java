package baeckjoon;

import java.util.Scanner;

public class Problem06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();

		for (int i = 0; i < a; i++) {
			String str = scan.next();
			
			
			char c = str.charAt(0);
			char c2 = str.charAt(str.length()-1);
			System.out.print(c);
			System.out.print(c2);
			System.out.println();
		}
		
		scan.close();
		
	}
}
