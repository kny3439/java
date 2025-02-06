package quiz13;

public class Marine extends Unit  {

	public static int attack=6;
	public static int armor=0;
	
	
	public Marine(int attack, int armor) {
		this.attack = attack;
		this.armor = armor;
		this.hp=60;
	}
	
	public void StimPack() {
		
		attack+=1;
		System.out.println("attack +1 : "+attack);
	}

	@Override
	public void location() {
		System.out.println("현재 위치: "+x+", "+y);
	}

	@Override
	public void move(int x, int y) {
		System.out.println("위치이동");
		System.out.println("x: " + x);
		System.out.println("y: " + y);
	}




}
