package day02;

public class OperaterEx05 {

	public static void main(String[] args) {

		// 삼항연산자
		// 랜덤 값

		System.out.println(Math.random()); // 0 이상 ~ 1.0 미만의 실수 랜덤 값

		// 1 ~ 10 까지 랜덤 한 수
		double d = Math.random() * 10;
		int r = (int) d + 1;
		System.out.println(r);

		// 한 줄로 표현
		int k = (int) (Math.random() * 10) + 1;
		System.out.println(k);

		// 짝수일까? 홀수일까?
		String result = k % 2 == 0 ? "짝수" : "홀수";
		System.out.println("랜덤수 " + r + " 은 " + result + "입니다.");
	}
}
