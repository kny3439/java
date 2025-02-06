package day03;

public class IfEx01 {

	public static void main(String[] args) {

		// 랜덤한 정수값
		int point = (int) (Math.random() * 100) + 1;
		System.out.println("점수: " + point);

		if (point >= 60) {
			System.out.println("합격입니다람쥐");
		} else {
			System.out.println("탈락입니다 ㅠㅠ");
		}
	}
}
