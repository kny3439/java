package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz11 {

	public static void main(String[] args) {
		// 첫째줄애 n정수가 주어진다.
		// 이후부터는 n줄에 걸쳐 정수를 입력받는다
		// 이 입력받은 값을 배열에 순서대로 저장
		// 배열의 크기 int[]arr=new int[크기];

		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();

		int[] arr = new int[size];

		int i = 0;
		while (i < size) {
			// 입력 받은 값을 배열에 넣는다.
			arr[i] = scan.nextInt();
			i++;
		}
		System.out.println(Arrays.toString(arr));

	}
}
