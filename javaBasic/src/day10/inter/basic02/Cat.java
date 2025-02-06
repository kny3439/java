package day10.inter.basic02;

public class Cat extends Animal implements Ipet {

	@Override
	public void eat() {
		System.out.println("고양이는 생선을 먹는다");
	}

	@Override
	public void play() {
		System.out.println("고양이는 방에서 놀아요");
	}

}
