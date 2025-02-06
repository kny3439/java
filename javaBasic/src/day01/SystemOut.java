package day01;

public class SystemOut {
	public static void main(String[] args) {
		// main이라 쓰고 ctrl + space

		// sysout 쓰고 ctrl + space

		// 1. ln은 개행
		System.out.println("곧 쉬는시간");
		System.out.println("나는 집에 가야해");

		// 2. print() - 개행 미포함
		System.out.print("줄바꿈 없다\n");
		System.out.print("줄바꿈 없다\n");

		// 3. printf() - 형식 지정 출력문
		/*
		 * 
		 * 서식문자 \n - 줄바꿈 \t - 탭버튼 %d - 정수를 받음 %s - 문자를 받음 %f - 실수를 받음
		 */
		System.out.printf("맨 처음에 하고 싶은 말을 적습니다. %s은 %d월 %d일 입니다.", "오늘", 12, 30);
		System.out.printf("\n원주율은 %f", 3.14);
		System.out.printf("\n원주율은 %.2f입니다", 3.14); // %.2f 소수 2자리 까지만 표현

		// 이 구문에서 숫자를 printf 문장으로 표현해보세요.
		System.out.printf("\n%dx%d=%d %dx%d=%d", 2, 1, 2, 2, 2, 4);
	}
}
