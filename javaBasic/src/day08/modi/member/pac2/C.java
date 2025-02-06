package day08.modi.member.pac2;

import day08.modi.member.pac1.A;

public class C extends A {
	A a = new A(1);
	// A a2 = new A("홍길동"); // 다른 패키지이므로 안됨.
	// A a3 = new A(true); // 다른패키지, 다른 클래스

	public C() {
		A a4 = new A();
		a4.a = 1;
		// a4.b =1;
		// a4.c =1;
		a.method1();
		// a.method2();
		// a.method3();
	}
}
