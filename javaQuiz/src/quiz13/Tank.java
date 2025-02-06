package quiz13;

public class Tank extends Unit {

	private boolean changeMode = false;

	@Override
	public void location() {

	}

	@Override
	public void move(int x, int y) {

	}

	public void changeMode() {
		changeMode = !changeMode;
	}


}
