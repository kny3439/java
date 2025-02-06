package baeckjoon;

import java.util.Scanner;

public class Problem10988 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String str=sc.next();
		
		String reverseStr="";
		
		for(int i=str.length()-1; i>=0; i--) {
			reverseStr+=str.charAt(i);
			
		}
		if(reverseStr.equals(str)) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
		
		sc.close();
		
	}
}
