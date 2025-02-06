package baeckjoon;

import java.util.Scanner;

public class Problem10807 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int a=scan.nextInt();
		
		int[]arr=new int[a];
		
		int sum=0;
		
		for(int i=0; i<arr.length; i++) {
			int b=scan.nextInt();
			arr[i]=b;
		
		}
		int num=scan.nextInt();
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==num) {
				sum++;
			}
		}
		System.out.println(sum);
	}
}
