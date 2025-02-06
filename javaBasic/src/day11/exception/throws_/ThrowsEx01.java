package day11.exception.throws_;

public class ThrowsEx01 {

	public static void main(String[] args) {

		/*
		 * 메서드, 생성자에서 발생되는 에외를 떠넘기는 키워드 throws throws 구문이 붙어있는 메서드, 생성자를 호출할 때는 예외처리를 대신
		 * 진행한다. 즉, 예외처리를 강요 할 때 사용 할 수 있다.
		 */

		try {
			greeting(10);

		} catch (Exception e) {
			System.out.println("인덱스는 0~2까지 전달하세요.");
		}

		try {
			Class.forName("sfew");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스를 찾을 수 없습니다");
			e.printStackTrace(); // 개발도중에, 이러의 내용을 보기 위해서 자주 사용하는 구문
		}
		
		System.out.println("프로그램 정상 종료");
	}

	private static String[] arr = { "hello", "안녕하세요", "사요나라" };

	// 메서드를 만드는 사람이 예외가 날 수 있음을 알려주는 역할 throws
	public static void greeting(int index) throws Exception {
		System.out.println(arr[index]);
	}

}
