package day03;

import java.util.Scanner;

public class MultiForEx02 {

	public static void main(String[] args) {

		// 바깥 반복문에 따라서 안쪽 반복문의 회전수가 달라지는 경우.
//		for(int i=1; i<=9; i++) {
//			
//			for(int j=1; j<= i; j++) {
//				System.out.println(i+"-"+j);
//			}
//		}

		// 조건이 바뀌는 for문
		// 바깥 반복문 - 행
		//

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("------------------");

		int star = 5;

		for (int i = 1; i <= star; i++) {
			for (int j = 1; j <= star + 1 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------------------");

		for (int i = 1; i <= star; i++) {

			for (int j = 1; j <= star - i; j++) { // 공백을 출력할 용도
				System.out.print(" ");
			}
			for (int j = 1; j <= i * 2 - 1; j++) { // 별을 출력할 용도
				System.out.print("*");
			}

			System.out.println();
		}

		
		System.out.println("------------------");

		
		Scanner scan = new Scanner(System.in);

		int star2 = scan.nextInt();

		for (int i = 1; i <= star2; i++) {

			for (int j = 1; j <= star2 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
