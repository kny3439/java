package generic.good;

public class MainClass {

	public static void main(String[] args) {

		Person<String> p = new Person<String>();

		p.setT("홍길동");
		String name = p.getT();
		
		
		//
		//
		Person<ABC> abc=new Person<>(); // 뒤 <> 타입생략 가능
		abc.setT(new ABC());
		abc.getT();
		
		// <>를 안주면 마법의 상자처럼 동작
		//Person p2=new Person();
		
		
		// 제네릭에는 기본 타입이 저장 될 수 없다 int -> Integer
		Person<Integer> p3=new Person<>();
		
		
		
		
	}
}
