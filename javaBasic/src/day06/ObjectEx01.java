package day06;

public class ObjectEx01 {

	public static void main(String[] args) {
		
		// 객체를 사용 하지 않는다면 ...
		System.out.println("---1번 계산기---");
		System.out.println(add(10));
		System.out.println(add(20));
		System.out.println(add(30));
		
		System.out.println("---2번 계산기---");
		System.out.println(add2(100));
		
		
		// 객체를 사용 한다면 ...
		System.out.println("---1번 계산기---");
		Calculator cal=new Calculator();
		System.out.println(cal.add(10));
		System.out.println(cal.add(20));
		System.out.println(cal.add(30));
		
		System.out.println("---2번 계산기---");
		Calculator cal2=new Calculator();
		System.out.println(cal2.add(100));
		System.out.println(cal2.add(200));
		System.out.println(cal2.add(300));
		
		
	}
	
	// 1번 계산기
	static int result=0;
	static int add(int a) {
		result+=a;
		return result;
	}
	
	static int result2=0;
	static int add2(int a) {
		result2+=a;
		return result2;
	}
}
