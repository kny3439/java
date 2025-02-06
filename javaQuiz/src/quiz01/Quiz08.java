package quiz01;

public class Quiz08 {

	public static void main(String[] args) {

		String[] arr = { "안녕하세여", "Hello", "金㡅連", "%^(%" };

		// 랜덤한 배열의 요소를 선택하고, 이 랜덤한 배열 요소에 따른 국가별 언어를 출력하라.

		int a = (int) (Math.random() * arr.length);

		switch (arr[a]) {
		case "안녕하세여":
			System.out.println("선택된단어:" + arr[0] + "\n한국어 입니다");
			break;
		case "Hello":
			System.out.println("선택된단어:" + arr[1] + "\n영어 입니다");
			break;
		case "金㡅連":
			System.out.println("선택된단어:" + arr[2] + "\n중국어 입니다");
			break;
		case "%^(%":
			System.out.println("선택된단어:" + arr[3] + "\n기호 입니다");
			break;

		default:
			break;
		}

	}
}
