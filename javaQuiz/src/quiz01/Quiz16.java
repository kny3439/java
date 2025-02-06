package quiz01;

import java.util.Scanner;

public class Quiz16 {

	public static void main(String[] args) {

		// 숙제
		// 어떤 수를 입력 받아서 입력받은 수 까지의 모든 소수들의 합계
		// 소수 - 약수가 1과 자기 자신인 수 (약수의 개수가 2개)
		// ex) 1-> 소수x 2-> 소수o 3-> 소수o 5 ->소수o

		// 입력 출력
		// 10 -> 2+3+5+7=17
		// 13 -> 2+3+5+7+11+13=41

		Scanner scan = new Scanner(System.in);

		System.out.println("정수> ");
		int n = scan.nextInt();
		int sum = 0;
		int cnt = 0;

		for (int i = 1; i <= n; i++) {
			
			// 1읭 약 수개수, 2의 약수 개수, .... num까지 약수의 개수
			for (int j = 1; j <= i; j++) {

				if (i % j == 0) {
					cnt++;
				}
			}
			if (cnt == 2) {
				// 소수
				sum += i;
			}
			cnt = 0;
		}

		System.out.println(sum);

	      
	      Scanner scanner = new Scanner(System.in);
	        int n2 = scanner.nextInt();

	        int sum2 = 0; // 소수의 합을 저장할 변수
	        String result = ""; // 소수를 저장할 문자열
	        boolean isFirstPrime = true; // 첫 번째 소수 여부 확인

	        for (int i = 2; i <= n2; i++) {
	            boolean isPrime = true; // 소수 여부를 확인할 변수

	            for (int j = 2; j < i; j++) {
	                if (i % j == 0) { // 나누어 떨어지면 소수가 아님
	                    isPrime = false;
	                    break;
	                }
	            }

	            if (isPrime) {
	                sum2 += i; // 소수라면 합계에 추가
                            
	                if (isFirstPrime) {
	                    result = result + i; // 첫 번째 소수는 그냥 추가
	                    isFirstPrime = false; // 첫 번째 소수 이후 false로 변경
	                } else {
	                    result = result + " + " + i; // 이후 소수는 +로 연결
	                }
	            }
	        }

	        System.out.println(result + " = " + sum2);
		
		
	        scan.close();
	}
}
