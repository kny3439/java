package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz23 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		int[][]arr=new int[9][9];
		
		for(int i =0; i<arr.length; i++) {

			for(int j=0; j<arr[i].length; j++) {
				int a=scan.nextInt();
				
				arr[i][j]=a;
			}
		}
		
		int max = arr[0][0];
		
		int n=1;
		int m=1;
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr[i].length; j++) {
				
				if(max<arr[i][j]) {
					max=arr[i][j];
					n=i+1;
					m=j+1;
				}
				
			}
			
		}
		System.out.println(max);
		System.out.println(n+" "+m);
		
		scan.close();
	}
}
