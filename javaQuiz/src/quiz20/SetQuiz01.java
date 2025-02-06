package quiz20;

import java.util.HashSet;
import java.util.Set;

public class SetQuiz01 {

	public static void main(String[] args) {

		/*
		 * 로또 번호 자동 생성기
		 * Set를 이용해서 6개의 랜덤한 로또 번호를 만들어내는 프로그램 코드를 작성해보세요.
		 * 
		 * 1~45 까지
		 * 
		 * */
		
		Set<Integer> set = new HashSet<>();
		
//		int i=1;
		while(true) {
			
			int ran=(int)(Math.random()*45)+1;
			
			set.add(ran);
		
			if(set.size()==6) {
				
				break;
			}
		}
		
		
		System.out.println(set.toString());
		
	}
	
}
