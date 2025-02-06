package day01;

public class Test {

		public static void main(String[] args) {

			// run 탭 -> run configuration -> argument탭 -> ${string+prompt}

			try {
					String a = args[0];
					String b = args[1];
		
					int x = Integer.parseInt(a); // 문자열 -> 숫자로 변환
					int y = Integer.parseInt(b);
		
					System.out.println(x + y);
			
					String str=null; // 기타예외......
					str.charAt(0);

				 //예외의 종류별로, 다른 프로그램 처리를 할 수 있다.
				} catch (ArrayIndexOutOfBoundsException | ClassCastException e) { // 예외를 처리 할 클래스
					System.out.println("실행 매개값을 반드시 2개 전달해 주세요");
				}catch(NumberFormatException e) { 
					System.out.println("실행 매개값을 반드시 숫자로 전달해 주세요");
				}catch(Exception e){ // 예외의 부모 클래스 이기 때문에, 모든 예외 처리 가능하다.
					System.out.println("기타예외입니다");
				}

		}
}
