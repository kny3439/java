package baeckjoon;

import java.util.Scanner;

public class Problem2675 {

	public static void main(String[] args) {
		
//		문자열의 각 문자를 하나씩 가져오는 과정이 필요
//		해당 문자를 R번 반복하는 과정이 필요
		
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();

		
//		for(int i=0; i<a; i++) {
//			int b=sc.nextInt();
//			for(int j=0; j<b; j++) {
//				for(int k=0; k<str.length(); k++) {
//					char c=str.charAt(k);
//					System.out.print(c);
//				}
//				
//			}
//			System.out.println();
//		}
		
		for(int k=0; k<s; k++ ) {
			int a=sc.nextInt();
			String str=sc.next();
			for(int i=0; i<str.length(); i++) {
				for(int j=0; j<a; j++) {
					char c=str.charAt(i);
					System.out.print(c);
				}
			}
			System.out.println();
		}	
		
		sc.close();
		
	}
}
