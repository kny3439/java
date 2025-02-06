package baeckjoon;

import java.util.Arrays;

public class Problem12 {

	public static int[] solution(String[] cpr) {
		int[] answer = { 0, 0, 0, 0, 0 };
		String[] basic_order = { "check", "call", "pressure", "respiration", "repeat" };

		for (int i = 0; i < basic_order.length; i++) {
			for (int j = 0; j < basic_order.length; j++) {
				if (cpr[i].equals(basic_order[j])) {
					answer[i] = j+1;
					
					break;
				}
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		String[] kim = {"call", "respiration", "repeat", "check", "pressure"};
		int[] a = solution(kim);
		System.out.println(Arrays.toString(a));
	}


}
