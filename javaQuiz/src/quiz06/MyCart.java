package quiz06;

import java.util.Arrays;

public class MyCart extends Cart {

	// 나의 장바구니 클래스 만들기

	// 1. MyCart의 생성자에서는 int매개변수를 하나 받으며, 금액을 초기화합니다.
	// tv=300원, com=400원, radio=500원 으로 초기화

	// 2. buy(), add(), info() 메서드를 오버라이딩 합니다.

	/*
	 * buy()의 기능 1. money가 300보다 작으면 "금액부족" 출력후 메서드를 종료. 매개변수가 tv, com, radio가 아니더라도
	 * "상품없음" 출력 후 종료 2. 매개변수 tv라면 금액에서 tv가격을 빼고 add(상품)을 호출 매개변수 com라면 금액에서 com가격을
	 * 빼고 add(상품)를 호출 매개변수 radio라면 금액에서 radio를 빼고 add(상품)을 호출
	 */

	/*
	 * info()의 기능
	 * 
	 * 2. 장바구니에 담긴 물건 목록을 + 금액을 더해서 출력 3. 메인에서 buy()를 실행 시킨다.
	 */

	MyCart(int a) {
		tv = 300;
		com = 400;
		radio = 500;
		money = a;
	}

	void buy(String product) {
		if (money < 300) {
			System.out.println("금액부족");
			return;
		}

//		if(!(product.equals("tv")||product.equals("com")||product.equals("radio"))) {
//			System.out.println("상품 없음");
//		}

		switch (product) {
		case "tv":
			if (money >= tv) {
				money -= tv;
				add(product);
			} else {
				System.out.println("금액부족");
			}

			break;
		case "com":
			if (money >= com) {
				money -= com;
				add(product);
			} else {
				System.out.println("금액부족");
			}

			break;
		case "radio":
			if (money >= radio) {
				money -= radio;
				add(product);
			} else {
				System.out.println("금액부족");
			}

			break;

		default:
			System.out.println("상품 없음");
			break;
		}

	}

	/*
	 * add()의 기능 1. 만약 i의 값이 장바구니의 크기보다 같거나 크다면 - 기존의 장바구니보다 크기가 * 2큰 배열을 생성. -기존의
	 * 장바구니 값을 새로운 배열에 복사. -새로운 장바구니를 기존의 장바구니와 바꾼다. 2. product를 장구니에 담는다. 3.
	 * info()메서드를 호출
	 */

	void add(String product) {
		if (i >= cart.length) {
			String[] cart2 = new String[cart.length * 2];
			for (int i = 0; i < cart.length; i++) {
				cart2[i] = cart[i];
			}
			cart = cart2;
			cart2 = null;
		}
		cart[i] = product;
		i++;
		info();
	}

	void info() {

		String str="[";
		for (int j = 0; j < i; j++) {
			str+=cart[j]+" ";
		}
		str+="]";
		System.out.println(str + "\n 남은금액: "+ money);
//		System.out.println("남은 금액: " + money + "원");
	}
}
