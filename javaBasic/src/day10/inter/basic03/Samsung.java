package day10.inter.basic03;

public class Samsung implements Printed {

	@Override
	public void print(String document) {
		System.out.println("from 삼성");
		System.out.println(document + " 출력됨");
	}

	@Override
	public int copy(int n) {
		System.out.println("from 삼성");
		for (int i = 1; i <= n; i++) {
			System.out.println(i + "장 복사");
		}
		return n;
	}

}
