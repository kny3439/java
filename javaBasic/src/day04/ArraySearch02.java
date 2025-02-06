package day04;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySearch02 {

	public static void main(String[] args) {

		// 1~100까지 정렬되어있는 숫자가 있을 때, 75라는 숫자를 찾는다!
		// 이진 탐색 - 반을 분할 해서 찾아가는 방법.
		// 조건 - 반드시 값이 순서대로 정렬

		// 1. 위치변수 포인터(start, end)를 처음과 끝에 2개를 배치
		// 2. 포인터의 중간값을 구함
		// 3. 중간값이 찾는값인지 확인함
		// 4. 찾는값이 중간값보다 크면 start를 중간값 +1 올림
		// 5. 찾는값이 중간값보다 작으면 end를 중간값 -1 내림

		int[] arr = { 1, 3, 5, 10, 20, 30, 50, 80, 100 };

		Scanner scan = new Scanner(System.in);
		System.out.println("찾을값> ");
		int find = scan.nextInt();

//		int start = 0;
//		int end = arr.length - 1; // 마지막 인덱스
//
//		while (start <= end) {
//
//			int mid = (start + end) / 2; // 중간값
//
//			if (arr[mid] == find) { // 값을 확인
//				System.out.println("찾는 값은: " + mid + "번째에 있습니다.");
//				break;
//			}
//
//			// 찾는 값이 중간값보다 큰 경우
//			if (arr[mid] < find) {
//				start = mid + 1;
//			} else {// 찾는 값이 중간 값보다 작은 경우
//				end = mid - 1;
//			}
//
//		}
//
//		// 값을 못 찾은 경우에 대한 처리
//		if (start > end) {
//			System.out.println("찾는 값이 없습니다.");
//		}
		
		
		// 찾은 위치를 알려줌, 찾을 값이 없다면 음수를 반환한다.
		System.out.println(Arrays.binarySearch(arr, find)+"번째에 있습니다.");

	}
}
