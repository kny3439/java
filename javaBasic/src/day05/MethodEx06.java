package day05;

import java.util.Arrays;

public class MethodEx06 {

	public static void main(String[] args) {

		// Queue - FIFO(First In First Out)
		// offer - 뒤에서 추가
		// poll - 앞에서 제거하고 반환

		offer(1);
		offer(2);
		offer(3);
		offer(4);
		offer(5);
		System.out.println(Arrays.toString(arr));
		
		for(int i=1; i<=5; i++) {
			System.out.println(poll());
		}
		System.out.println(Arrays.toString(arr));

	}

	static int[] arr = {};

	static void offer(int data) {

		// 1. 배열의 크기를 +1 한 새로운 배열 생성
		int[] temp = new int[arr.length + 1];

		// 2. 배열 복사
		for (int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}

		// 3. 마지막 추가
		temp[temp.length - 1] = data;

		// 4. 원본 배열을 바꿔치기
		arr = temp;
		temp = null;

	}

	static int poll() {

		// 1. 배열의 길이가 0보다 클 때만 실행
		if (arr.length > 0) {

			// 2. 삭제 할 데이더 백업(0번째)
			int del = arr[0];

			int[] temp = new int[arr.length - 1];

			// 3. 배열의 1번째 요소 ~ 마지막 요소까지 temp에 옮겨 담는다.
			for (int i = 0; i < temp.length; i++) {
				temp[i] = arr[i+1];
			}

			// 4. 원본 배열을 바꿔치기
			arr = temp;
			temp=null;

			// 5. 삭제한 데이터 반환
		
			return del;
			

		}

		return 0;
	}
}
