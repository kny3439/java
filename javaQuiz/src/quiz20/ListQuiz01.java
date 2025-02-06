package quiz20;

import java.util.ArrayList;
import java.util.List;

public class ListQuiz01 {

	public static void main(String[] args) {

		// 1. 1~30까지 값을 순서대로 저장
		List<Integer> list = new ArrayList<>();
		
		for (int i = 1; i <= 30; i++) {

			list.add(i);
		}

		System.out.println(list.toString());

		// 2. 리스트에서 짝수 요소 값만 가로로 출력
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) % 2 == 0) {
				System.out.print(list.get(i) + " ");
			}
		}

	}
}
