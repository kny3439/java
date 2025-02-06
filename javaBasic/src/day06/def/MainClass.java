package day06.def;

//import day06.abc.Apple; // 다른 패키지의 클래스를 사용 할 때 import
//import day06.abc.Melon;

// 해당 패키지의 모든 클래스를 한번에 import하려면
import day06.abc.*;

public class MainClass {

	public static void main(String[] args) {
		
		Apple a= new Apple();
		Melon m=new Melon();
				
		int i=1;
		System.out.println(i); // 1
		
		System.out.println(a); // 주소값
		
	}
}
