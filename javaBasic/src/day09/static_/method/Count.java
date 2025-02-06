package day09.static_.method;

public class Count {

	public int a;
	public static int b;

	// 일반 메서드 - 일반 변수, 정적 변수 모두 사용 가능
	public int method01() {
		a = 10;
		return ++b;
	}

	// 정적 메서드 - static멤버들만 접근 가능하다.
	// 단, 객체 생성을 통해서는 일반 변수도 사용이 가능하다.
	public static int method02() {
//		a = 10;
		Count c = new Count();
		c.a = 1;
		return ++b;
	}

}
