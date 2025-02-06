package quiz11;

public class MainClass {

	public static void main(String[] args) {
		Warrior w = new Warrior("지존나연");

		Warrior w2 = new Warrior("타락파워전사");

		Sorceress s = new Sorceress("drakeDog");

		w.crush(w2);
		w.crush(s);

		w2.info();
		s.info();

		Player[] arr = { w2, s }; // 플레이어 배열에 전사, 마법사가 들어갈 수 있다.
		s.blizzard(arr);
	}
}
