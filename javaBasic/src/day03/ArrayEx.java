package day03;

import java.util.Arrays;

public class ArrayEx {

	public static void main(String[] args) {

		// 1. 배열의 선언
		int[] arr;

		// 2. 배열의 생성
		arr = new int[5];

		System.out.println(arr); // 배열의 주소값(만들어진 위치)가 나온다.

		// 3. 배열의 초기화
		arr[0] = 58;
		arr[1] = 23;
		arr[2] = 45;
		arr[3] = 2;
		arr[4] = 86;

		// 4. 배열의 사용
		System.out.println("배열의 세번째 값" + arr[2]);
		System.out.println("배열의 첫번째 값" + arr[0]);

		// 5. 배열의 저장된 값을 한눈에 문자열로 확인
		System.out.println(Arrays.toString(arr));

		// 6. 배열의 길이를 확인하는 명령어. 배열명.length
		System.out.println("배열의 길이:" + arr.length);

		// 7. 배열의 선언과 생성을 동시에 하는 법
		int[] arr2 = new int[10];

		// 8. 배열의 선언과 생성, 초기화 까지 동시에 하는 법
		int[] arr3 = { 1, 2, 3, 4, 5 };
		int[] arr4 = new int[] { 1, 2, 3, 4, 5 };

		// 9 배열의 초기값을 지정하지 않으면, 기본 값으로 초기화가 된다.
		// 0, 0.0 , false, null
		System.out.println(Arrays.toString(arr2));

		// 크기가 7인 문자열 배열을 만들고, 월~일 저장
		String[] a = { "월", "화", "수", "목", "금", "토", "일" };
		System.out.println(Arrays.toString(a));

		String[] m = new String[7];
		m[0] = "월";
		m[1] = "화";
		m[2] = "수";
		m[3] = "목";
		m[4] = "금";
		m[5] = "토";
		m[6] = "일";
		System.out.println(Arrays.toString(m));
		
	}
}
