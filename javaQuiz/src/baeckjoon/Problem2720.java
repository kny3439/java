package baeckjoon;

import java.util.Scanner;

public class Problem2720 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		double quater=25;
		double dime=10;
		double nickel=5;
		double penny=1;
		
		for(int i=0; i<a; i++) {
			
			int num=sc.nextInt();
			
			int q=(int) (num/quater);
			num%=quater;
				
			int d=(int) (num/dime);
			num%=dime;
			
			int n=(int) (num/nickel);
			num%=nickel;
			
			int p=(int) (num/penny);
			num%=penny;
			
			System.out.println(q+" "+d+" "+n+" "+p);
		}
		
		sc.close();
	}
}
