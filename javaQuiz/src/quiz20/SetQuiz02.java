package quiz20;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetQuiz02 {

	public static void main(String[] args) {

		/*
		 * 로또기기 당첨 시뮬레이터!
		 * 
		 * {5, 23, 35, 7, 41, 13} 이 번호가 당첨 번호입니다. 랜덤한 로또번호 6개를 생성해서, 당첨 번호와 일치하는지 확인합니다.
		 * 몇 번의 시도 끝에 당첨되는지 계산하고, 소요된 비용을 출력하세요. 로또 1회 구매 비용은 1,000원입니다.
		 * 
		 * 힌트) set이 요소가 동일한지 확인하는 메서드는 set.equals(set) 입니다
		 */
		Random random = new Random();
		Integer[] arr= {5,23,35,7,41,13};
		List<Integer>list=Arrays.asList(arr);
		Set<Integer> winning = new TreeSet<>(); // 초기값
		Set<Integer>lotto=new TreeSet<>(list);
	

		int cnt = 0;

		while (true) {
			
			winning.add( random.nextInt(45) + 1);

			if (winning.size() == 6) {
				
				cnt++;
				
				if (lotto.equals(winning)) {
					break;
				} else {
					winning.clear();
				}
			}

		}
		System.out.println("시도: " + cnt);
		System.out.println("구매비용: " + (1000L *cnt)+ "원");
		

	}
}
