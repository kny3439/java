package quiz17;

import java.util.Scanner;

public class StringQuiz01 {

	public static void main(String[] args) {
		/*
		 * id 문자열을 입력받는다
		 * 아이디는 공백을 포함해서 받을 수 있다. nextLine()
		 * 공백을 제외하고, 5글자 미만이면 다시 입력받는다
		 * 5글자 이상이면 "id 등록" 을 출력하고 종료
		 * */
		
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			String id=sc.nextLine();
			
			id=id.replace(" ", "");
			
			if(id.length()<5) {
				System.out.println("5글자 미만입니다.");
			}else {
				System.out.println("id 등록");
				break;
			}
		}
		
		sc.close();
		
	}
}
