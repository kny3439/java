package day08.modi.member.pac1;

public class B {

	A a = new A(1); // public
	A a2 = new A("홍길동"); // default
	// A a3 = new A(true); private

	public B() {
		// 여기에서 A안의 변수를 사용하고 싶다면?
		A a4 = new A();
		a4.a = 1;
		a4.b = 1;
		// a4.c=1; // private (x)

		a4.method1();
		a4.method2();
		// a4.method3(); // private (x)
	}
}
