package baeckjoon;

import java.util.Scanner;

public class Problem09 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

//		int h = scan.nextInt();
//		int m = scan.nextInt();
//		int a = scan.nextInt();
//
//		if (60 < m + a) {
//
//			h = (int) h + ((a + m) / 60);
//			m = (a + m) - 60;
//
//			if (m == 60) {
//
//				m = 0;
//
//			} else if (h == 24) {
//
//				h = 0;
//
//			}
//		} else if (60 >= m + a) {
//
//			m += a;
//
//			if (m == 60) {
//
//				m = 0;
//				h++;
//				if (h == 24) {
//
//					h = 0;
//
//				}
//
//			}
//
//		}
//
//		System.out.println(h + " " + m);

		int h = scan.nextInt(); // 시 입력
		int m = scan.nextInt(); // 분 입력
		int a = scan.nextInt(); // 추가 분 입력

		// 총합 분 계산
		int totalMinutes = h * 60 + m + a;

		// 시와 분 계산
		h = (totalMinutes / 60) % 24; // 총 시간을 24로 나눠 24시간 체계 유지
		m = totalMinutes % 60; // 나머지 분 계산

		// 결과 출력
		System.out.println(h + " " + m);
		System.out.println(2 % 24);

		scan.close();
	}
}
