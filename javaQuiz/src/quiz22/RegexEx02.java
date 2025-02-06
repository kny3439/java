package quiz22;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx02 {

	public static void main(String[] args) {
		
		//상품번호, GS25, (상품명), 가격 분리해서 출력.
		String str = "123123-45644 GS25(치킨도시락) 4,400원";
		String str2 = "123123-3453454 GS25(마늘햄쌈) 5,000원";
		String str3 = "123456-3453 GS(김혜자도시락) 6,000";
		String[] arr = {str, str2, str3};
		
		String pattern="\\d{6}-\\d{4,7}";
		String pattern2="GS[25]*";
		String pattern3="\\([가-힣]+\\)";
		String pattern4="\\d+,\\d+원*";
		
		
		
		for(int i=0; i<arr.length; i++) {
			
			Matcher m=Pattern.compile(pattern).matcher(arr[i]);
//			if(m.find()) {
//				System.out.println(m.group());
//			}
//			
//			System.out.println();
//			
			Matcher m2=Pattern.compile(pattern2).matcher(arr[i]);
//			if(m2.find()) {
//				System.out.println(m2.group());
//			}
//			
//			System.out.println();
//			
			Matcher m3=Pattern.compile(pattern3).matcher(arr[i]);
//			if(m3.find()) {
//				System.out.println(m3.group());
//			}
//			
//			System.out.println();
//			
			Matcher m4=Pattern.compile(pattern4).matcher(arr[i]);
//			if(m4.find()) {
//				System.out.println(m4.group());
//			}
			
			if(m.find() && m2.find()&&m3.find()&&m4.find()) {
				System.out.println(m.group());
				System.out.println(m2.group());
				System.out.println(m3.group());
				System.out.println(m4.group());
			}
			
			System.out.println("------------------");
			
			
		}
	

		
		
	}
}
