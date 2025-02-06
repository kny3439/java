package day08.super_.basic1;

public class Child extends Parent{

	Child(String father, String mother) {
		super(father, mother);
	}

	// 아무것도 적지 않아도 생략.
//	Child(){
//		super();
//	}
	
	// 부모님의 기본 생성자가 없으면, 상속 받았을 때, 강제로 생성자를 연결 해야한다.
	
	Child(){
		super("나연","김나연");
	}
	
	
}
