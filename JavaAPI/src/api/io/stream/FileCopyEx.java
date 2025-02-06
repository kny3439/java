package api.io.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class FileCopyEx {

	public static void main(String[] args) {
		
		
		InputStream fis=null;
		OutputStream fos=null;
		
		String inputPath="C:\\Users\\kny86\\Desktop\\cours\\java\\file\\copy.jpg";
		String OutputPath="C:\\Users\\kny86\\Desktop\\cours\\java\\filecopy\\copy.jpg";
		
		try {
			fis= new FileInputStream(inputPath);
			fos= new FileOutputStream(OutputPath);
			
			
			// 100바이트 단위로 읽은
			byte[]arr=new byte[100];
			
			int result;
			while((result=fis.read(arr))!=-1) {
//				System.out.println(Arrays.toString(arr));
				fos.write(arr, 0, result);// 데이터, 시작위치, 쓸 위치
			}
			
			System.out.println("파일 복사 성공!");
			
			 // 읽은 길이 반환, 더이상 읽을 데이더가 없으면 -1 반환
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			 try {
				fis.close();
				fos.close();
			} catch (Exception e2) {
				
			}
		}
		
		
	}
}
