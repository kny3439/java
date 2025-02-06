package day10.inter.basic02;

public class GoldFish extends Fish implements Ipet {

	@Override
	public void swim() {
		System.out.println("금붕어는 어항에서 수영해요");
	}

	@Override
	public void play() {
		System.out.println("금붕어는 어항에서 놀아요");
	}

}
