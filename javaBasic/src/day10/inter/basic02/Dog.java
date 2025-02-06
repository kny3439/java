package day10.inter.basic02;

public class Dog extends Animal implements Ipet {

	@Override
	public void eat() {
		System.out.println("강아지는 사료를 먹는다");
	}

	@Override
	public void play() {
		System.out.println("강아지는 밖에서 놀아요");
	}

}
