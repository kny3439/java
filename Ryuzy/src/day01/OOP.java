package day01;

public class OOP {
	public static void main(String[] args) {
		강아지 루시 = new 강아지();
		System.out.println(루시.이름);
		강아지 뭉치 = new 강아지("뭉치", "리트리버", 2);
		System.out.println(뭉치.이름);
		강아지 잡종이 = new 강아지("잡종이");
		System.out.println(잡종이.이름);
		루시.먹는다();
		루시.잔다();

		동물 괴물 = new 동물();
		System.out.println(괴물.이름);
		동물 유령 = new 동물("유령이", "호랑이", 30.7);
		System.out.println(유령.이름);
		유령.먹는다();
		유령.잔다();

	}

}
