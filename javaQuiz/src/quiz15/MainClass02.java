package quiz15;

import java.util.Scanner;

public class MainClass02 {

	public static void main(String[] args) {

		int r = (int)(Math.random()*100)+1;
		
		int cnt=0;

		Scanner sc = new Scanner(System.in);

		while (true) {

			try {
				int answer = sc.nextInt();
				if (r < answer) {
					System.out.println("더 작은 값을 입력하세요");
					cnt++;
					
				} else if (r > answer) {
					System.out.println("더 큰 값을 입력하세요");
					cnt++;
				}else if(r==answer) {
					System.out.println("정답입니다");
					System.out.println("틀린 개수: "+cnt);
				}

			} catch (Exception e) {
				System.out.println("잘못입력했습니다");
				sc.nextLine();
				cnt++;
			}

		}

	}
}
