package quiz04;

public class MainClass {

	public static void main(String[] args) {

		/*
		 * Arrays.toString()와 똑같은 기능 구현하기 
		 * 1. toArray() - int[]을 매개변수로 입력받아 배열의 모형을 문자열로 리턴하는 메서드 
		 * 2. toArray() - 1번과 내용은 같고, char[]을 받도록 overloading 
		 * 2. toArray() - 1번과 내용은 같고, String[]을 받도록 overloading
		 */
		
//		Quiz04Basic b=new Quiz04Basic();
//		int[]arr= {1,2,3,4,5};
//		String result=b.toArray(arr);
//		System.out.println("["+result.substring(2)+"]");
		
		Quiz04Basic b=new Quiz04Basic();
		int[]arr= {1,2,3,4,5};
		String result=b.toArray(arr);
		System.out.println(result);
			
		char[]arr2={'안','녕','하','세','요'};
		b.toArray(arr2);
		String result2=b.toArray(arr2);
		System.out.println(result2);
		
		String[]arr3= {"안녕","하세요","^ㅅ^","V"};
		b.toArray(arr3);
		String result3=b.toArray(arr3);
		System.out.println(result3);
		
		Quiz04Basic a=new Quiz04Basic();
		
		System.out.println(Quiz04Basic.toArray(arr));
		
		System.out.println(Quiz04Basic.toArray(arr2));
		
		System.out.println(Quiz04Basic.toArray(arr3));
		
		
		
	}
	
	
	
	

}
