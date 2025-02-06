package quiz13;

public abstract class Unit {

	public int x = 0;
	public int y = 0;
	public int hp;

	public abstract void location();
	public abstract void move(int x, int y);
	public void stop() {
		System.out.println("정지!");
	}

}
