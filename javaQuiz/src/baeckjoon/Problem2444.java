package baeckjoon;

import java.util.Scanner;

public class Problem2444 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		for(int i=0; i<a; i++) {
			
			
			for(int j=1; j<a-i; j++) {
				
				System.out.print(" ");
			}
			for(int j=0; j<i*2+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		for(int i=a-1; i>0; i--) {
			
			
			for(int j=a-i+1; j>1; j--) {
				
				System.out.print(" ");
			}
			for(int j=i*2+1; j>2; j--) {
				
				System.out.print("*");
			}
			if (i > 0) { 
                System.out.println();
            }
		}
		
		sc.close();
	}
}
