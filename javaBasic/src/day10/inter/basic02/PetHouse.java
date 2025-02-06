package day10.inter.basic02;

public class PetHouse {

	// 매개변수로 펫 타입을 받아서, 매개변수에 따라서, 형 변환을 진행하는 메서드
	public static void carePet(Ipet ipet) {
		if (ipet instanceof Dog) {
			
			Dog dog = (Dog) ipet;
			System.out.println("강아지로 형 변환");
			dog.eat();
			dog.play();
			
		} else if (ipet instanceof Cat) {
			
			Cat cat = (Cat) ipet;
			System.out.println("고양이로 형 변환");
			cat.eat();
			cat.play();
			
		} else if (ipet instanceof GoldFish) {
			
			GoldFish goldfish = (GoldFish) ipet;
			System.out.println("금붕어로 형 변환");
			goldfish.swim();
			goldfish.play();
			
		}

	}

}
