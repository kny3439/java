package day01;

public class 동물 {
	String 이름;
	String 종;
	double 몸무게;
	
	동물(){
		this.이름 = "무명";
		this.종 = "괴물";
		this.몸무게 = 1.5;
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
}
