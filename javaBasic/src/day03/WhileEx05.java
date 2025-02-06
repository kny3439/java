package day03;

public class WhileEx05 {

	public static void main(String[] args) {

		// 배열과 반복.
		String[] arr = { "민수", "영희", "영자", "영숙", "길동" };

		int i = 0;
		while (i <= arr.length - 1) {
			System.out.println(arr[i]);
			i++;
		}

		int[] iArr = { 43, 65, 25, 45, 4, 55 }; // 정수 배열의 합

		int j = 0;
		int sum = 0;
		while (j < iArr.length) {
			sum += iArr[j];
			j++;
		}
		System.out.println("배열 요소의 합 "+sum);

	}
}
