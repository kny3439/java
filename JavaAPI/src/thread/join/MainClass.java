package thread.join;

public class MainClass {

	public static void main(String[] args) {
		
		TestA a=new TestA();
		Thread thread=new Thread(a);
		
		thread.start();
		
		try {
			thread.join(); // 이 쓰레드가 종료 될 때 까지 다른 쓰레드를 정지 시킴
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		System.out.println("A쓰레드의 계산 결과: "+a.sum);
		System.out.println("메인쓰레드 종료");
	}
}
