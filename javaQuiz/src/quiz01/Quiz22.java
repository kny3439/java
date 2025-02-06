package quiz01;

import java.util.Arrays;

public class Quiz22 {

	public static void main(String[] args) {

		// 배열의 크기를 한개 늘리고, 값을 복사하고, 맨 안에 data룰 추가해보세요

		int[] arr = { 10, 20, 30, 40, 50 };
		int data = 100;
		int first = 0;

		int[] newArr = new int[arr.length + 1];

		for (int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		System.out.println(Arrays.toString(newArr));

		for (int i = newArr.length - 1; i > first; i--) {
			newArr[i] = newArr[i - 1];
		}
		
		newArr[first]=data;
		
		
		
		
		System.out.println(Arrays.toString(newArr));
		
		
	}
}
