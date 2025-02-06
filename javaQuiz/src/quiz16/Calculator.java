package quiz16;

import java.util.Scanner;

public class Calculator {

	public int input() throws Exception {
		/*
		 * 1. 정수 2개를 입력받는다. 2. 입력된 값이 정수라면 단순히 합계를 반환 해주면 된다. 3. 예외가 발생하면, catch안에서 예외를
		 * 다시 한번 생성하고, Throws처리 한다. 4. scan.close는 finally구문에서 처리한다.
		 */

		Scanner sc = new Scanner(System.in);

		try {
			int a = sc.nextInt();
			int b = sc.nextInt();
			return a + b;
		} catch (Exception e) {
			throw new Exception("정수로 입력");

		} finally {
			sc.close();
		}
	}

	public static void main(String[] args) throws Exception {
		Calculator cal = new Calculator();

		try {
			int r = cal.input();
			System.out.println(r);
		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
		}
		
		

	}
}
