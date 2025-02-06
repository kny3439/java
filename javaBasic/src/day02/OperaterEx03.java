package day02;

public class OperaterEx03 {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		// if 뒤에 소괄호가 참이면 if 중괄호를 실행, 거짓이면 else를 실행
		
		if (a != 10 && ++b == 21) { // 뒤에를 검사할 필요가 없는 조건인 경우, 뒤에 고드를 실행하지 않는다.
			System.out.println("참");
		} else {
			System.out.println("거짓");
		}

		System.out.println("a값:" + a);
		System.out.println("b값:" + b);

		if (a == 10 || ++b == 21) {
			System.out.println("참");
		} else {
			System.out.println("거짓");
		}

		System.out.println("a값:" + a);
		System.out.println("b값:" + b);

	}
}
