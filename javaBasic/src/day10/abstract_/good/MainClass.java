package day10.abstract_.good;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		 * 추상클래스 - 다형성을 사용 할 수 있게 해주는 방법이다.
		 * 		> 자식에서 반드시 오버라이드가 들어가기 때문에.
		 * 
		 * 추상메서드 - 자식클래스에서 오버라이딩을 강제화 하게 된다.
		 * */
		
		SeoulStore s=new SeoulStore();
		
		System.out.println(s.StoreName);
		s.melon();
		s.apple();
		s.orange();
		s.grape();
		s.mango();
		
		
		System.out.println("--------------------------");
		
		BusanStore b=new BusanStore();
		
		System.out.println(b.StoreName);
		b.melon();
		b.apple();
		b.orange();
		b.grape();
		b.mango();
	}
}
