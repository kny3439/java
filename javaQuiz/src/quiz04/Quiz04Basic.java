package quiz04;

public class Quiz04Basic {
	
	/*
	 *1. Quiz04Basic 는 접근 제어자를 통해서, 외부에서 객체로 생성 할 수 없도록 만들어라
	 *2. 메서드에는 public static을 붙여서 메인에서 호출 해주세요. 
	 * */
	Quiz04Basic() {
		
	}
	
	

	public static String toArray(int[] arr) {
		String str = "[";

		if (arr == null) {
			return "null";
		}
		if (arr.length <= 0) {
			return "[]";
		}
		for (int i = 0; i < arr.length; i++) {

			str += arr[i];
			if (i == arr.length - 1) {
				str += "]";
				return str;
			}
			str += ", ";

		}

		return str;

	}

	public static String toArray(char[] arr) {
		String str = "[";

		if (arr == null) {
			return "null";
		}
		if (arr.length <= 0) {
			return "[]";
		}
		for (int i = 0; i < arr.length; i++) {

//			str=str+","+arr[i];
			str += arr[i];
			if (i == arr.length - 1) {
				str += "]";
				return str;
			}
			str += ", ";

		}

		return str;
	}

	public static String toArray(String[] arr) {
		String str = "[";

		if (arr == null) {
			return "null";
		}
		if (arr.length <= 0) {
			return "[]";
		}
		for (int i = 0; i < arr.length; i++) {

//			str=str+","+arr[i];
			str += arr[i];
			if (i == arr.length - 1) {
				str += "]";
				return str;
			}
			str += ", ";

		}

		return str;

	}
}
