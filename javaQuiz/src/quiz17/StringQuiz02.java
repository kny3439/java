package quiz17;

import java.util.Arrays;

public class StringQuiz02 {

	/*
	 * 문자열 거꾸로 뒤집기
	 * 
	 * 매개 변수로 전달 받은 문자열을, 거꾸로 뒤집어서 반환하는 메서드를 생성하세요
	 * 
	 * reverse(String)
	 *
	 * 입력 -> abcde
	 * 반환 -> edcba
	 * 
	 * */
	
	public static String  reverse(String str) {
		
//		char[] sum=new char[str.length()];
		
		String r="";
//		int cnt=0;
		
		for(int i=str.length()-1; i>=0; i--) {
			
//			sum[i]=str.charAt(cnt);
			r+=str.charAt(i);
		}
		
		return r;
		
//		System.out.println(Arrays.toString(sum));
		
	}
	
	public static void main(String[] args) {
		System.out.println(reverse("abcde"));
		
	}
}
