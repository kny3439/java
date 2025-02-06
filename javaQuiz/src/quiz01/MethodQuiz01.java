package quiz01;

import java.util.Arrays;

public class MethodQuiz01 {

	public static void main(String[] args) {
		sum1();

		String result1 = sum2("sum2의 매개변수");
		System.out.println(result1);

		int result2 = sum3(1, 2, 1.5);
		System.out.println(result2);

		String result3 = sum4(4);
		System.out.println(result3);

		sum5("Hello", 3);

		int result4 = sum6(1, 2);
		System.out.println(result4);

		int result5 = sum7(-5);
		System.out.println(result5);

		char[] arr = { 'A', 'B', 'C' };
		String result6 = sum8(arr);
		System.out.println(result6);

		int[] arr2 = { 1, 2, 3, 4, 5 };
		int result7 = sum9(arr2);
		System.out.println(result7);

		String[] arr3 = sum10("홍길동", "김나연");
		System.out.println(Arrays.toString(arr3));

		String str = sum11(5);
		System.out.println(str);

	}

	static void sum1() {
		System.out.println("안녕");
	}

	static String sum2(String a) {
		String sum = a;
		return sum;
	}

	static int sum3(int a, int b, double c) {

		int sum = 0;
		sum = (int) (a + b + c);
		return sum;

	}

	static String sum4(int a) {

		return a % 2 == 0 ? "짝수" : "홀수";

	}

	static void sum5(String a, int b) {

		for (int i = 0; i < b; i++) {
			System.out.println(a);
		}
	}

	static int sum6(int a, int b) {

		int sum = 0;
		if (a > b) {
			sum = a;
		} else {
			sum = b;
		}

		return sum;

	}

	static int sum7(int a) {

		int sum = a;
		if (a < 0) {
			sum = -sum;
		}

		return sum;

	}

	static String sum8(char[] arr) {

		String sum = "";
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	static int sum9(int[] arr) {

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	static String[] sum10(String s1, String s2) {

		String[] arr = { s1, s2 };

		return arr;
	}

	static String sum11(int a) {

		String sum = "";

		for (int i = 1; i <= a; i++) {

			if (i % 2 == 1) {
				sum += "자";
			} else {
				sum += "바";
			}
		}

		return sum;
	}

}
