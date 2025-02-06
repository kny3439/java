package quiz02;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		
		String a=scan.next();
		String[][]arr=new String[5][a.length()];
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr[i].length; j++) {
				
				char c=a.charAt(j);
				arr[i][j]= String.valueOf(c);
				
			}
			System.out.println();
		}
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}
