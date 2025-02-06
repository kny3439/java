package day05;

import java.util.Arrays;

public class MethodEx04 {

	public static void main(String[] args) {

		// 배열을 매개변수로 전달 하는 법
		int[] arr = { 1, 2, 3, 4, 5 };
		inputArray(arr);
		
		
		inputArray(new int[] { 1, 2, 3, 4, 5 });

		// 배열을 반환하는 메서드
		int[] arr2 =returnArray();
		System.out.println(Arrays.toString(arr2));
		
	}

	// 배열을 매개변수로 받는 메서드 모형
	static void inputArray(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	// 배열을 반환하는 메서드 모형
	static int[] returnArray() {
		
		// 어떻게든 배열을 만들어서, 변수명으로 리턴하면 됨
		int[] arr=new int[3];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		
		
		return arr;
	}

}
