package baeckjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem15552 {
	
	public static void main(String[] args) {
		
		try {
			
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
			
			int input=br.read();
			
			bw.write(input);
			bw.flush();
			
			for(int i=0; i<input; i++) {
				int a=br.read();
				int b=br.read();
				bw.write(a+b);
				bw.flush();
			}
			
			br.close();
			bw.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
