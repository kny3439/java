package baeckjoon;

import java.util.Scanner;

public class Problem11005 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(Integer.toString(a,b).toUpperCase());
		
		sc.close();
	}
}
