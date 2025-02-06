package baeckjoon;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Problem1152 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		StringTokenizer token=new StringTokenizer(str);
		
		System.out.println(token.countTokens());
		
		sc.close();
	}
}
