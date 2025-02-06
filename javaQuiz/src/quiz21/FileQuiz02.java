package quiz21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class FileQuiz02 {

	public static void main(String[] args) {

		/*
		 * 날짜 클래스를 이용해서 file 경로에 20250124.txt 이름으로 파일을 쓴다. 내용은 "그만"을 입력 할 때까지 작성 파일을
		 * 썼다면, ButtereReader를 이용해 파일의 내용을 읽어라.
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		Date date = new Date();

		String path = date.date("C:\\Users\\kny86\\Desktop\\cours\\java\\file\\20250124.txt");

		BufferedWriter bw = null;

		try {
			bw = new BufferedWriter(new FileWriter(path));

			while (true) {
				String str = sc.nextLine();

				if (str.equals("그만")) {
					break;
				}
				str += "\n";

				bw.write(str);
				bw.flush();
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();

			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

		BufferedReader br = null;

		try {
			br = new BufferedReader(new FileReader(path));

			System.out.println(br.readLine());

			String word;

			while ((word = br.readLine()) != null) {
				System.out.println(word);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}
}
