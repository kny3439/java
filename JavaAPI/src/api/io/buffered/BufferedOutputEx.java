package api.io.buffered;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class BufferedOutputEx {
	
	public static void main(String[] args) {
		
		/*
		 * Buffered가 붙은 클래스는 성능 향상을 위한 스트림 클래스이다.
		 * 
		 * Buffered + 스트림타입으로, 이름이 결정된다.
		 * 
		 * BufferedOutputStream는 outputStream의 성능 향상 스트림이다.
		 * 
		 * */
		
		String path="C:\\\\Users\\\\kny86\\\\Desktop\\\\cours\\\\java\\\\file\\\\test01.txt";
		
//		OutputStream os=null;
		BufferedOutputStream bos=null;
		
		try {
//			os= new FileOutputStream(path);
			
			bos=new BufferedOutputStream(new FileOutputStream(path));
			
			String str="youjin choi? good morning?";
			
			bos.write(str.getBytes()); // 문자열 -> 바이트
			bos.flush(); // 버퍼를 밀어냄 (데이터가 전달 됨)
			
			//Thread.sleep(20000); // 20초 스탑
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				bos.close();
			} catch (Exception e2) {
				
			}
		}
		
		System.out.println("프로그램 정상 종료");
		// 프로그램이 종료되면 버퍼가 자동으로 비워짐.
		
	}

}
