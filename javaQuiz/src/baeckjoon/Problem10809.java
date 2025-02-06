package baeckjoon;

import java.util.Scanner;

public class Problem10809 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String word=sc.next();
		
		String str="";
		
		for(char i='a'; i<='z'; i++) {
			str+=i;
			System.out.print(word.indexOf(i)+" ");
			
		}
	
	}
}
