package baeckjoon;

import java.util.Scanner;

public class Problem07 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		String n = scan.next();
		
		int sum=0;

		for (int i = 0; i < n.length(); i++) { // 문자열 반복

			char c = n.charAt(i);
			int l=c-48;
			
			sum+=l;
			
			
		}
		System.out.println(sum);

	}
}
