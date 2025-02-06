package day10.final_;

public class MainClass {

	public static void main(String[] args) {

		Person kim = new Person("김길동", "123456");
		Person hong = new Person("홍길동", "456789");
		
		System.out.println(kim.ssn);
		System.out.println(hong.ssn);
		
		
		// 값의 변경 금지
//		kim.ssn="바꿔야지~"
		
		System.out.println("-----------------------------------------");
		
		// 상수 사용
		System.out.println(Constant.PI);
		System.out.println(Constant.O2);
		System.out.println(Constant.EARTH_RADIUS);
		System.out.println(Math.PI);
		System.out.println(Integer.MAX_VALUE);
	}
}
