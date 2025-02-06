 package quiz01;

import java.util.Scanner;

public class Quiz20 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int[] arr = new int[a];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
		}

		int m = arr[0];
		int s = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (m > arr[i]) {
				m = arr[i];
			} 
			if (s < arr[i]) {
				s = arr[i];
			}
		
		}
		System.out.println(m + " " + s);

		scan.close();
	}
}
