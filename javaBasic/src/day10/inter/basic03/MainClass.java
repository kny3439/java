package day10.inter.basic03;

public class MainClass {

	public static void main(String[] args) {

//		LG lg=new LG();
//		lg.print("LG로 실행");
//		lg.copy(5);

		Printed pt = new Samsung();// new LG();
		pt.print("print 실행 ~");
		pt.copy(5);

	}
}
