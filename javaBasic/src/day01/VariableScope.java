package day01;

public class VariableScope {
	public static void main(String[] args) {

//		int num1=10;
//		int num2=20;
		int num1 = 10, num2 = 20; // 같은 타입 변수라면 ','로 나열 할 수 있다.
		int num4 = 40;

		// 변수의 유효 범위 (변수는 해당 중괄호 안에서만 유효하다.)
		if (true) {
			int num3 = 30;
			num4 = 400;
		}

		int num3 = 40;
		System.out.println(num3);
		System.out.println(num4);
	}
}
