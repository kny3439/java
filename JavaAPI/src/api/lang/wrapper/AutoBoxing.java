package api.lang.wrapper;

public class AutoBoxing {

	public static void main(String[] args) {
		
		// AutoBoxing - 기본 타입을 자동으로 클래스형으로 변환 (반대도 가능)
		// 기본타입 - 기본갑 0, 0.0, false
		// 객체형타입 - 기본값 null
		
		Integer val1=1; // String str="...";
		double val2=3.14; 
		
		int a=val1;
		double b=val2; 
		
		// 래퍼 클래스는 유용한 기능들이 static메서드로 제공해준다.
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		// 🌟🌟🌟 문자열을 -> 기본형으로 변환하는 메서드 🌟🌟🌟
		int result1=Integer.parseInt("3");
		double result2=Double.parseDouble("3.14");
		long result3=Long.parseLong("30");
		
		System.out.println(result1+result2+result3);
		
		
		
	}
}
