package baeckjoon;

import java.util.Scanner;

public class Problem2869 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int afternoon=sc.nextInt();
		int night=sc.nextInt();
		int height=sc.nextInt();
		
		int result=(height-night)/(afternoon-night);
		
		if((height-night)%(afternoon-night)!=0) {
			result+=1;
			System.out.println(result);
		}else {
			
			System.out.println(result);
		}
		
		
	}
}
