package thread.join;

public class TestA implements Runnable {

	public int sum=0;
	@Override
	public void run() {

// 1~100 까지의 누적 합
		for(int i=1; i<=100; i++) {
			sum+=i;
			System.out.println("A현재 누적 합: "+sum);
			
			
			try {
				Thread.sleep(100);
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}

}
