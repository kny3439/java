package quiz13;

public class MainClass {

	public static void main(String[] args) {
		
		Marine m1=new Marine(2,3);
		Marine m2=new Marine(3,5);
		Marine m3=new Marine(5,6);
		Marine m4=new Marine(8,4);
		
		Tank t1=new Tank();
		
		DropShip ship=new DropShip();
		ship.ride(m1);
		ship.ride(m2);
		ship.ride(m3);
		ship.ride(m4);
		ship.ride(t1);
		ship.ride(t1); // 더이상 자리가 없음
	}
}
