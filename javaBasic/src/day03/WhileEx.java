package day03;

public class WhileEx {

	public static void main(String[] args) {

		int a = 1; // 제어변수 - 반복문의 횟수를 제어할 변수
		int sum = 0;

		while (a <= 10) {

//			System.out.println(a);
			sum += a;

			a++; // 제어변수 조작으로 언잔가, 조건이 false가 되도록 만들어줌
		}

		System.out.println("1~10까지의 합:" + sum);
		System.out.println("반복문 종료");

	}
}
