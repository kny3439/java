package api.io.buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Scanner;

public class 빠른입출력 {

	public static void main(String[] args) {
		// System.out.println( ); // 출력
		// Scanner sc=new Scanner(System.in); // 입력

		/*
		 * 빠른 입출력 에서는 InputStreamReader OutputStreamWriter 클래스를 사용한다.
		 * 
		 */

		try {

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println(">");
			String input = br.readLine();

			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			// 입력 받은 내용을 출력
			bw.write(input);
			bw.flush();

			br.close();
			bw.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
