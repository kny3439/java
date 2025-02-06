package day02;

public class OOP {
	public static void main(String[] args) {
		강아지 루시 = new 강아지();
//		System.out.println(루시.이름);	// private 으로 막아버림
		강아지 뭉치 = new 강아지("뭉치", "리트리버", 2);
//		System.out.println(뭉치.이름); 	// private 으로 막아버림
		강아지 잡종이 = new 강아지("잡종이");
//		System.out.println(잡종이.이름); 	// private 으로 막아버림
		루시.먹는다();
		루시.잔다();

		동물 괴물 = new 동물();
		System.out.println(괴물.이름);
		동물 유령 = new 동물("유령이", "호랑이", 30.7);
		System.out.println(유령.이름);
		유령.먹는다();
		유령.잔다();
		
		강아지 흰둥이 = new 강아지();
//		흰둥이.이름 = "검둥이"; // 이런짓 하지 말아라(은닉성) 	// private 으로 막아버림
//		System.out.println(흰둥이.이름); 	// private 으로 막아버림
		흰둥이.set이름("검둥이");
		System.out.println(흰둥이.get이름());

		System.out.println(동물.눈개수);
		동물.눈개수 = 1;
		System.out.println(동물.눈개수);
		
		System.out.println(동물.국적);
//		동물.국적 = "미국";
		
		동물.싸다();
		
//		아이언 맨 = new 아이언(); // 객체를 생성할 수 없음
		
		
		
	}

}
