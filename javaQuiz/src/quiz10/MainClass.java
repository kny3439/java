package quiz10;

public class MainClass {

	public static void main(String[] args) {
		
		Computer computer=new Computer();
		
//		Computer computer=new Computer(new KeyBoard(), new Mouse(), new Monitor());
		
		Monitor monitor= computer.getMonitor();
		
		monitor.info();
	}
}
