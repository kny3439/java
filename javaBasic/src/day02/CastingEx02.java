package day02;

public class CastingEx02 {

	public static void main(String[] args) {

		// 다운캐스팅 - 크기가 큰 타입을 작은 타입으로 저장 할 때는 (type)캐스팅을
		// 이용해서 명시적으로 형 변환을 진행 해야 한다.

		int i = 65;
		char c = (char) i;
		short s = (short) i;

		float f = 3.24f;
		int j = (int) f;

		System.out.println(j);

		
		// 주의 할 점 - 값을 받을 수 없는 범위가 되면, 잘려나간 값이 저장이 된다.

		int a = 256;
		byte b = (byte)a;
		System.out.println(b);

	}
}
