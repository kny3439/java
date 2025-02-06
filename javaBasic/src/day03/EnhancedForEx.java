package day03;

public class EnhancedForEx {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };

		// 일반 반복문
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}

		System.out.println();
		// 향상된 for문
		for (int a : arr) {
			System.out.print(a);
		}

		System.out.println("---------------");

		String[] arr2 = { "월", "화", "수", "목", "금", "토", "일" };

		for (String a : arr2) {
			System.out.print(a + " ");
		}
		System.out.println("---------------");

		int[] point = { 50, 56, 52, 54, 58 }; // 배열요소의 합계와 평균
		int sum =0;
		double sum2=0;
		
		for(int a: point) {
			sum+=a;
			sum2=(double)sum/point.length;
		}
		System.out.println("합계: "+sum);
		System.out.println("평균: "+sum2);
	}
}
