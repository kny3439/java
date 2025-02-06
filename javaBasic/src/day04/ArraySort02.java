package day04;

import java.util.Arrays;

public class ArraySort02 {

	public static void main(String[] args) {

		// 버블 정렬 - 장점: 쉽다, 단점: 느리다
		// 가장 큰 수를 뒤로 보냄
		int[] arr = { 5, 23, 1, 43, 200, 100, 40 };

		// 바깥 반복문 회전수
		// 아쪽 반복문 비교할 값

//		for (int i = 0; i < arr.length; i++) {
//
//			for (int j = 0; j < arr.length - i - 1; j++) {
//
//				if (arr[j] > arr[j + 1]) {
//
//					int temp = arr[j];
//					arr[j] = arr[j + 1];
//					arr[j + 1] = temp;
//
//				}
//			}
//		}
//		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr); // 정렬을 해줘(아주빠르게)
		System.out.println(Arrays.toString(arr));
	}
}
