package day04;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {

		// 배열의 정렬 - 정렬의 방식은 매우 다양하다.
		// 선택 정렬 - 장점: 쉽다, 단점: 느리다

		int[] arr = { 5, 23, 1, 43, 200, 100, 40 };

		// 바깥 반복문은 회전수
		// 안쪽 반복문은 비교할 값
		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			
			System.out.println(Arrays.toString(arr));
		}

	}
}
