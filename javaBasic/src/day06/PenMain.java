package day06;

public class PenMain {

	public static void main(String[] args) {

		// Pen을 쓰고 싶으면 객체롤 생성을 해야한다.
		// 펜의 속성에 접근 할 대 . 연산자를 쓴다.
		Pen black = new Pen();
		black.ink = "검정";
		black.price = 1000;
		black.company = "모나미";

		black.write();
		String r = black.info();
		System.out.println(r);

		System.out.println();

		Pen red = new Pen();
		red.ink = "빨강";
		red.price = 1200;
		red.company = "하이테크";

		red.write();
		String r2 = red.info();
		System.out.println(r2);

		Calculator cal = new Calculator();
		System.out.println(cal.add(black.price));
		System.out.println("두 펜을 더한 값: " + cal.add(red.price));
	}
}
