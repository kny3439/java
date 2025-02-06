package api.util.random;

import java.util.Random;

public class RandomEx {

	public static void main(String[] args) {

		Random random = new Random();

		double d = random.nextDouble();
		System.out.println("0~1미만: " + d);

		int a = random.nextInt();
		System.out.println("int범위의 랜덤 수: " + a);

		int b = random.nextInt(10);
		System.out.println("0~10미만: " + b);

	}
}
