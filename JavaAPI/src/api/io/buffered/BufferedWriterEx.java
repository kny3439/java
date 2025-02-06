package api.io.buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class BufferedWriterEx {

	public static void main(String[] args) {
		
		
		// 2바이트 기반에 성능향상 보조 스트림 BufferesWriter
		
		Scanner sc=new Scanner(System.in);
		
		String path="C:\\Users\\kny86\\Desktop\\cours\\java\\file\\test02.txt";
		
		BufferedWriter bw=null;
		
		try {
			 bw=new BufferedWriter(new FileWriter(path,true)); // true를 주면 기존 파일이 있을경우, 내용을 이어서 작성하게 된다.
			 
			 
			 while(true) {
				 System.out.print(">");
				 String str=sc.nextLine();
				 
				 if(str.equals("exit")) {
					 break;
				 }
				 str+="\r\n"; // 줄바꿈
				 
				 bw.write(str);
				 bw.flush(); // buffer로 받으면 해줘야 나옴
			 }
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				bw.close();
			} catch (Exception e2) {
				
			}
		}
		
		
	}
}
