package baeckjoon;

import java.util.Scanner;

public class Problem2903 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

//		 double r=Math.pow((a+1)+a, 2);
		
			double r=Math.pow(2, a)+1;
			double r2=Math.pow(r, 2);
			
			System.out.println((int)r2);
			
			sc.close();
			
	}
}
