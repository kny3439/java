package quiz23;

public class Download implements Runnable  {

	@Override
	public void run() {
		System.out.println("동영상 다운 시작");
		
		
		for(int i=1; i<=10; i++) {
			System.out.print("*");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
			}
		}
		System.out.println("\n동영상 다운 완료");
	}

}
