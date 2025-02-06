package api.io.folder;

import java.io.File;

public class CreatFolder {

	public static void main(String[] args) {

		/*
		 * 폴더 생성 할 때는 File클래스를 사용한다. 생성자 매개변수로 폴더를 경로 + 폴더명을 지정한다.
		 * 
		 */

		String path = "C:\\Users\\kny86\\Desktop\\cours\\java\\file\\myfolder";

		try {

			File file = new File(path);
			
			if(!file.exists()) { // 파일이 존재하면 true
				file.mkdir();// 폴더 생성
				System.out.println("폴더 생성");
			}else {
				System.out.println("폴더가 이미 있습니다.");
				file.delete(); // 폴더 삭제(파일 삭제)
			}
			
				
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
