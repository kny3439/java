package day10.inter.basic03;

public class LG implements Printed{

	private String lg = "Life is good";

	public void print(String document) {
		System.out.println(lg);
		System.out.println("문서내용: " + document);
	}

	public int copy(int n) {
		System.out.println(lg);
		System.out.println(n + "장 복사를 시작합니다");
		return n;
	}

}
