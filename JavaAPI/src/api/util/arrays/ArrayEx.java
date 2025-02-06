package api.util.arrays;

import java.util.Arrays;

public class ArrayEx {

	public static void main(String[] args) {

		// util패키지 부터는, import구문이 반드시 들어간다.
		int[] arr = { 65, 34, 23, 63, 88, 1, 25, 11 };

		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		// 이진 탐색에는 반드시 정렬이 필요하다
		int index = Arrays.binarySearch(arr, 34);
		System.out.println("34가 있는 위치: " + (index + 1));
		int index2 = Arrays.binarySearch(arr, 100);
		System.out.println("찾는 값이 없으면 음수 반환: " + index2);
		
		// 배열의 복사
		int[]newArr=Arrays.copyOf(arr, arr.length);
		System.out.println("복사된 배열: "+ Arrays.toString(newArr));
		
		// 배열의 복수 - 범위 만큼만 복사
		int[]newArr2=Arrays.copyOfRange(arr, 0, 3); // 0~3미만 복사
		System.out.println("범위 지정 복사: "+Arrays.toString(newArr2));
		
		
		// 배열의 내부요소가 동일한지 확인 equals()
		if(Arrays.equals(arr, newArr)) {
			System.out.println("배열의 요소가 같음");
		}else {
			System.out.println("배열의 요소가 같지 않음");
		}
		
	}
}
