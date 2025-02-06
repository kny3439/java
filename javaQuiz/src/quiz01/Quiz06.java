package quiz01;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {

		// 어떤 수 하나를 입력 받은 후 그 숫자가 홀수, 짝수, 0, 음수인지를 구분해서 출력

		Scanner scan = new Scanner(System.in);

		System.out.print("숫자 입력> ");
		int num = scan.nextInt();

		if (num > 0 && num % 2 == 0) {
			System.out.println("짝수입니다");
		} else if (num % 2 == 1) {
			System.out.println("홀수입니다");

		} else if (num == 0) {
			System.out.println("0입니다");
		} else if (num < 0) {
			System.out.println("음수입니다");
		}

		scan.close();
		
		Scanner c = new Scanner(System.in);
		
		int h=c.nextInt();
		int m=c.nextInt();
		
	
		
	}
}
