package quiz19;

import java.util.Scanner;
import java.util.StringTokenizer;

public class MainClass {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		StringTokenizer token=new StringTokenizer(str," ");
		System.out.println(token.countTokens());
		
		while(token.hasMoreTokens()) {
			System.out.println(token.nextToken());
		}
		
	}
}
