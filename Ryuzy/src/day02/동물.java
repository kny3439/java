package day02;

public class 동물 {
	String 이름;
	String 종;
	double 몸무게;
	final int 다리수 = 4;
	static int 눈개수 = 2;
	static final String 국적 = "대한민국";
	
	동물(){
		this.이름 = "무명";
		this.종 = "괴물";
		this.몸무게 = 1.5;
		// 다리수 = 5;	// 수정못함
	}
	
	동물(String 이름, String 종, double 몸무게){
		this.이름 = 이름;
		this.종 = 종;
		this.몸무게 = 몸무게;
	}
	
	void 먹는다() {
		System.out.println("먹이를 먹는다");
	}
	// 오버라이드
	void 잔다() {
		System.out.println("잔다");
	}
	
	static void 싸다() {
		System.out.println("많이 싼다");
	}
	
}
