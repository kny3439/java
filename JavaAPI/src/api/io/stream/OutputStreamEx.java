package api.io.stream;


import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamEx {

	public static void main(String[] args) {

		/*
		 * io패키지의 모든 클래스는 생성자가 throws키워드를 던지고 있어서 모두 try~catch블록과 함께 사용
		 */

		String path = "C:\\Users\\kny86\\Desktop\\cours\\java\\file\\hello.txt";

		
		OutputStream fos = null;
//		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(path);
			String str = "길동아 잠 깨";
			fos.write(str.getBytes());

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();

			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
	}
}
