package baeckjoon;

import java.util.Scanner;

public class Problem2908 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int n2 = sc.nextInt();

		String str = Integer.toString(n);
		StringBuilder sb = new StringBuilder(str);
		
		
		int a=Integer.parseInt(sb.reverse().toString());

		String str2 = Integer.toString(n2);
		StringBuilder sb2 = new StringBuilder(str2);
		
		int b=Integer.parseInt(sb2.reverse().toString());
		
		if(a>b) {
			System.out.println(a);
		}else {
			System.out.println(b);
		}

		sc.close();
	}
}
