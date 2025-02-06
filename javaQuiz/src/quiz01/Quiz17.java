package quiz01;

import java.util.Scanner;

public class Quiz17 {

	public static void main(String[] args) {

		// 랜덤한 (1~100) 문제를 생성하고, 정답 맞히기 프로그램
		// 0를 입력 하면 종료가 된다.
		// 종료될땐 정답, 오답 개수를 출력하라.

		Scanner scan = new Scanner(System.in);
		int num1=0;
		int num2=0;

		while (true) {
			int a = (int) (Math.random() * 100) + 1;
			int b = (int) (Math.random() * 100) + 1;
			
			System.out.println(a + " + " + b + " = " + " ? ");
			System.out.println("[문제를 그만 푸시려면 0을 입력하세요.]");
			System.out.print(">");
			int answer = scan.nextInt();
			
			if(answer==0) {
				System.out.println("프로그램 정상 종료");
				break;
			}else if(answer==a+b) {
				System.out.println("정답입니다!");
				num1++;
			}else {
				System.out.println("오답입니다.");
				num2++;
			}
		}
		System.out.println("정답: "+num1);
		System.out.println("오답: "+num2);
		
		scan.close();

	}
}
