package quiz11;

public class Sorceress extends Player {

	// 1. 생성자 - 이름을 전달 받아서, hp = 500, mp = 1000으로 초기화
	public Sorceress(String name) {
		this.name = name;
		this.hp = 500; // 체력
		this.mp = 1000; // 마나
	}

	// 2. 블리자드 스킬 - 광역공격기
	// 블리자드 스킬은 마나 200을 소모
	// 배열안에 들어있는 모든 객체에 5~15사이의 랜덤한 피해를 한번 발생 시킨다.
	// 타격당한 플레이어의 체력을 소모해 주면 된다.
	// 타격당한 플레이어의 이름을 출력해라.
	public void blizzard(Player[] players) {

		if (mp < 200) {
			System.out.println("마나부족");
			return;
		}

		mp -= 200;

		for (int i = 0; i < players.length; i++) {
			int m = (int) (Math.random() * 10) + 5;
			players[i].hp -= m;

			System.out.println(players[i].name + "님이" + m + "피해를 입었습니다.");

		}
	}
}
