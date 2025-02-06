package thread.ex01;

public class MainClass {

	public static void main(String[] args) {
		// 메인 쓰레드
		// 객체 1개를 쓰레드 n개로 실행 - 동시성의 문제가 생길 수 있다
		ThreadTest th=new ThreadTest();
		
		Thread thread=new Thread(th,"A");
		Thread thread2=new Thread(th,"B");
		thread.start();
		thread2.start();
		
		try {
			thread.sleep(5000);
			System.out.println("메인 쓰레드 종료");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
