package day02;

public class DataTypeEx02 {
	public static void main(String[] args) {

		// 단일 문자 저장하는 타입 char
		char c1 = 'A'; // 한 글자만 가능 2byte
		char c2 = 65;

		System.out.println(c1);
		System.out.println(c2);

		char c3 = '가';
		char c4 = 44032;
		char c5 = '\uAC00';

		// 문자를 통일하기 위해 유니코드 -> 2byte크리고 확장 후 65536개의 문자를 사용 가능.
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);

		System.out.println("---------------------");

		// 문자열
		String s1 = "내 친구";
		String s2 = " 홍길동은";
		String s3 = " 말썽꾸러기이다. 길동아 정신 차려라";

		System.out.println(s1 + s2 + s3);// 문자를 + 붙이면 문자열을 붙인 결과가 된다.
		System.out.println("s1의 문자열 길이:" + s1.length());

		// 문자열과 다른 데이터 타입의 + 연산
		System.out.println(100 + 200);
		System.out.println("100" + 200);// 문자열에 다른 타입이 붙으면 -> 결과는 문자열
		System.out.println(100 + 200 + "300");
		System.out.println("100" + 200 + 3.14);
		System.out.println("A" + 10);
		System.out.println('A' + 10);

	}
}
