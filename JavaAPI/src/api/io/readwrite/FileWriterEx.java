package api.io.readwrite;

import java.io.FileWriter;

public class FileWriterEx {

	public static void main(String[] args) {
		
		// 문자를 써서 파일을 저장할 대 사용 하는 클래스 FileWriter이다.
		// 2바이트 기반으로 동작하기 때문에, 한글처리가 가능하다.
		
		
		String path="C:\\Users\\kny86\\Desktop\\cours\\java\\file\\bye.txt";
		
		FileWriter fw=null;
		
		try {
			fw=new FileWriter(path);
			
			// 캐리지 리턴
			String str="지금은 4시 12분 이다. \n 아 집에 가고싶다~~~~~~ \n 저 먼저 가도 되나요?";
			
			fw.write(str);
			
			System.out.println("성공!");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (Exception e2) {
				
			}
		}
	}
}
