package quiz11;

public class Warrior extends Player {

	// 1. 생성자 - 이름을 전달 받아서, hp = 1000, mp = 500 으로 초기화
	public Warrior(String name) {
		this.name = name;
		this.hp = 1000; // 체력
		this.mp = 500; // 마나
	}

	// 2. 으깨기 기술 - 매개변수로 Player를 받는다.
	// 스킬을 사용하면 나의 mp가 100이 소모가 된다.
	// 마나가 없으면 스킬 사용 못함
	// 타격당한 상대방은 hp가 100이 소모가 된다.
	public void crush(Player player) {

		if (mp < 100) {
			System.out.println("마나부족");
			return;
		}
		mp -= 100;
		player.hp -= 100;
		System.out.println(this.name + "이 crush를 사용합니다.");
		System.out.println(player.name+"님이 100의 피해를 입었습니다.");
	}

}
