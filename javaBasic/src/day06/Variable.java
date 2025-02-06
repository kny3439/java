package day06;

public class Variable {

	// 멤버변수 : 초기화 하지 않으면 0, 0.0, null, false
	int a;

	void printNum(int c) {
		int b=1; // 지역변수: 초기화 하지 않으면 못쓴다.
		System.out.println("멤버변수: " + a);
		System.out.println("지역변수: " + b);
		System.out.println("매개변수: " + c);

	}

}
