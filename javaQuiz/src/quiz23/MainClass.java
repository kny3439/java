package quiz23;

public class MainClass {

	public static void main(String[] args) {
		Video a=new Video();
		Download b=new Download();
		
		Thread thread1 = new Thread(a);
		Thread thread2 = new Thread(b);
		thread1.start();
		thread2.start();
		
	}
}
