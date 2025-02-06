package quiz01;

public class Quiz02 {

	public static void main(String[] args) {

		// 1. 랜덤한 정수 1~100이 주어질 때, 이 값이 5의 배수인지 확인하고, 출력하라
		int a = (int) (Math.random() * 100) + 1;
		System.out.println(a);

		String l = a % 5 == 0 ? "5의 배수" : "5의 배수가 아님";
		System.out.println(l);

		// 2. 랜덤한 정수 -5~5가 주어질 때, 언제나 이 값을 절대값으로 출력하라
		int h = (int) (Math.random() * 11 - 5);
		System.out.println(h);

		int result = h < 0 ? -h : h;
		System.out.println("절대값:" + result);

		System.out.println("--------------------");

//		사과 x개를 상자에 담을 때 필요한 상자의 개수를 구하려고합니다.
//		한 상자에는 최대 10개의 사과가 들어 갈 수 있습니다.
//
//		* 사과의 개수가 1~150개 랜덤하게 주어질 때, 
//		필요한 바구니의 개수를 구하는 프로그램을 작성하세요.

		int apple = (int) (Math.random() * 150 + 1);
		int box = 10;

		System.out.println(apple);

		int r = apple % box == 0 ? apple / box : apple / box + 1;
		System.out.println("필요한 바구니의 개수: " + r);

	}
}
