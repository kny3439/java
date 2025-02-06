package api.lang.system;

import java.util.Properties;

public class SystemEx {

	public static void main(String[] args) {
		
		// 다양한 운영체제의 정보를 확인 할 수 있다.
//		Properties properties=System.getProperties();
//		System.out.println(properties);
		
		/*
		 * 1970년 1월 1일 부터 ~ 지금까지 시간을 밀리초로 반환
		 * */
		
		long start=System.currentTimeMillis();
		System.out.println(start);
		
		long sum=0;
		for(long i=1; i<=10000000000L; i++) {
			sum+=i;
		}
		
		long end=System.currentTimeMillis();
		System.out.println(end);
		
		
		System.out.println("실행소요시간: "+(end-start)*0.001+"초");
		
		System.exit(1); // 프로그램 종료
		
		
		
	}
}
