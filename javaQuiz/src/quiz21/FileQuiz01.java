package quiz21;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStream;
import java.util.Scanner;

public class FileQuiz01 {

	public static void main(String[] args) {
		/*
		 * 스캐너를 이용해서 파일명을 입력 받는다
		 * file폴더 하위에 입력받은 파일명으로 파일을 쓴다
		 * 파일을 쓸 때, "쓰고싶은 말"을 사용자에게 입력 받는다
		 * 
		 * */
		
		Scanner sc=new Scanner(System.in);
		String p=sc.next();
		
		String path="C:\\\\Users\\\\kny86\\\\Desktop\\\\cours\\\\java\\\\file\\\\\\\\"+p;
		
		FileWriter fos=null;
		
		try {
			fos = new FileWriter(path);
			
			sc.nextLine();
			
			String w=sc.nextLine();
			
			fos.write(w);
			System.out.println("성공!");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fos.close();
			} catch (Exception e2) {
				
			}
		}
		
	}
}
