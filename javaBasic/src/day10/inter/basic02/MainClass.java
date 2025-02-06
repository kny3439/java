package day10.inter.basic02;

public class MainClass {

	public static void main(String[] args) {
		Animal baduk=new Dog();
		Animal shampoo=new Cat();
		Animal hodol=new Tiger();
		
		Animal[]arr= {baduk, shampoo,hodol};
		
		for(Animal a:arr) {
			a.eat(); // 애니멀처럼 동작됨
		}
		
		// 펫 타입
		Ipet[] arr2=new Ipet[3];
		arr2[0]=(Ipet)baduk; // 바둑이는 Animal타입이지만, Ipet을 구현하고 있어서 상호 형변환이 가능하다.
		arr2[1]=(Ipet)shampoo;
		arr2[2]=new GoldFish();
		
		for(Ipet pet:arr2) {
			pet.play();
		}
		
		System.out.println("-----------------------------------");
		
		
		PetHouse.carePet((Ipet)baduk);
		PetHouse.carePet(arr2[1]);
		PetHouse.carePet(new GoldFish());
		
	}
}
