package quiz01;

import java.util.Scanner;

public class Qiuz14 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	
		int a=scan.nextInt();

		
		if(a<70) {
			System.out.println("D");
		}else if(a<=80) {
			System.out.println("C");
		}else if(a<=90) {
			System.out.println("B");
		}else if(a<=100) {
			System.out.println("A");
		}else{
			System.out.println("F");
		}
		
		scan.close();
	}
}
