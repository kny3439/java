package day01;

public class 강아지 extends 동물 {
	String 이름;
	String 종;
	int 나이;

	// 기본값을 넣기 위해 생성자를 만든다.
	강아지() {
		this.이름 = "무명";
		this.종 = "잡종";
		this.나이 = 0;
	}
	
	// this()를 알려주기 위해 만든 생성자
	강아지(String 이름){
		this(이름, "잡종", 0);
	}

	// 생성자 오버로딩을 하겠어
	강아지(String 이름, String 종, int 나이) {
		this.이름 = 이름;
		this.종 = 종;
		this.나이 = 나이;
	}
	
	void 잔다() {
		System.out.println("잘잔다");
	}
}
