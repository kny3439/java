package day02;

public class OperaterEx02 {

	public static void main(String[] args) {

		// 2항 연산자
		int i = 7 * 3;
		int j = 7 % 3; // 나머지
		int k = 7 / 3; // 몫

		System.out.println(i);
		System.out.println(j);
		System.out.println(k);

		// 비교 연산자
		System.out.println(i == j);
		System.out.println(i != j);
		System.out.println(i >= j);
		System.out.println(k != 21);
		System.out.println(k < 21);

		System.out.println("---------------------");

		// 비트 연산자 &,| , ^
		int a = 5;
		int b = 3;
		System.out.println(a & b); // 둘 다 1이면 1, 아니면 0 -> 0000 0001
		System.out.println(a | b);
		System.out.println(a ^ b);

		// 비트 쉬프트 >>, <<
		int h = 192;
		System.out.println(h<<3);
		System.out.println(h>>3);
		
		
	}
}
