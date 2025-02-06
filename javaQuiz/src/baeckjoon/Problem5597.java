package baeckjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Problem5597 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		int[]arr=new int[30];
		
		for(int i=0; i<28; i++) {
//			System.out.println(arr[i]);
			int num=scan.nextInt();
			arr[num-1]=1;
		}
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==0) {
				System.out.println(i+1);
			}
		}
		scan.close();
	}
}
