package day03;

public class DoWhileEx {

	public static void main(String[] args) {

		// dowhile - 조건이 false여도 무조건 한 번은 실행된다.
		// 2회전 부터는 while문과 동일하다.

		int i = 1;
		do {

			System.out.println(i);
			i++;
		} while (i >= 10);
	}
}
