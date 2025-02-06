package quiz23;

public class Video implements Runnable  {

	@Override
	public void run() {
		System.out.println("음악을 15초간 재생 합니다");
		for(int i=1; i<=15; i++) {
			
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
			}
		}
		System.err.println("음악 재생 끝");
		
	}

}
