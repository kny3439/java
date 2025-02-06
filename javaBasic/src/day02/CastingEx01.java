package day02;

public class CastingEx01 {

	public static void main(String[] args) {

		// 자동 형 변환 - 크기가 작은 타입을 큰 타입에 대입. 업캐스팅
		// JVM(자바가상머신)

		byte b = 10;
		short c = b;
		int i = b;
		long l = b;

		char cc = 'A';
		int ii = cc;

		System.out.println(ii);

		int k = 10;
		double d = k;
		System.out.println(d);
		
	}
}
