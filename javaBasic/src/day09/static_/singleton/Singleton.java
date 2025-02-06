package day09.static_.singleton;

public class Singleton {

	// 싱글톤패턴 - 객체가 1개만 생성되도록 클래스를 디자인 하는 방법

	// 1. 외부에서 객체를 생성하지 못하도록, 생성자에 private을 붙임
	public Singleton() {

	}

	// 2. 자신의 클래스 안에서 스스로의 객체 단 1개를 생성한다.
	private static Singleton instance = new Singleton();

	// 3. 외부에서 객체를 요구하면 getter메서드를 통해서 instance를 반환한다.
	public static Singleton getInstance() {

		return instance;
	}

	private String name = "홍길동";

	public String getName() {
		return name;
	}

}
