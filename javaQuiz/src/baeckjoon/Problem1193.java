package baeckjoon;

import java.util.Scanner;

public class Problem1193 {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        int x = sc.nextInt();
	        sc.close();
	        
	        int sum = 0;  // 대각선 누적 합
	        int n = 0;    // 대각선 번호

	        // 몇 번째 대각선인지 찾기
	        while (sum < x) {
	            n++;
	            sum += n;
	        }

	        // 해당 대각선에서 몇 번째 숫자인지 계산
	        int index = x - (sum - n);

	        int bt, top; 
	        
	        // 대각선이 짝수라면 분자가 증가, 홀수라면 분모가 증가
	        if (n % 2 == 0) {
	            bt = index;
	            top = n - index + 1;
	        } else {
	            bt = n - index + 1;
	            top = index;
	        }

	        System.out.println(bt + "/" + top);
	    }
	}
