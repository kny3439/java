package baeckjoon;

import java.util.Scanner;

public class Problem05 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		int a=scan.nextInt();
		
		char b=s.charAt(a-1);
		System.out.println(b);
		
		int len=s.length();
		System.out.println(len);
		
		scan.close();
	}
}
