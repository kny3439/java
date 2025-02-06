package day06.str_ex;

public class StringExample {

	public static void main(String[] args) {
		
		String str1="홍길자";
		String str2="홍길자";
		String str3=new String("홍길자");	
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		
		/*
		 * 같은 클래스에서 동일한 문자열을 생성하면, 같은 주소를 바라보게 된다.
		 * 
		 * 하지만, 직접 String객체 생성명령을 내리거나 다른클래스에서 넘어온
		 * String은 다른 주소를 가지게 된다.
		 * 
		 * 그래서 문자열을 비교시는 '==' 대신 '.equals()' 메서드를 사용하여 문자열 동등비교를 한다.
		 * 
		 * equals() - 문자열 그 자체를 비교해서 동일하면 true 다르면 false
		 * 
		 * */
		
		if(str1.equals(str3)) {
			System.out.println("문자열 자체가 같음");
		}else {
			System.out.println("다른 문자열");
		}
		
		
	}
}
