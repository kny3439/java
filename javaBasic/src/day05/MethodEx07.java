package day05;

import java.util.Arrays;

public class MethodEx07 {

	public static void main(String[] args) {

		// call by value vs call by reference
		int a = 1;
		value(a);// 기본타입 변수는 값을 복사해서 전달시킴

		System.out.println(a);

		System.out.println("---------------");

		int[] arr = new int[] { 1, 2, 3, 4, 5 };
		reference(arr);
		
		System.out.println(Arrays.toString(arr));
		
	}

	// call by value
	static void value(int a) {
		a = 100;
	}

	// call by reference
	static void reference(int[] x) { // 주소값
		x[0] = 100;
		x[1] = 300;
		x[2] = 500;
	}

}
