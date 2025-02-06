package baeckjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Problem2941 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		
		String[]arr= {"c=","c-","dz=","d-","lj","nj","s=","z="};
		
//		int cnt=0;
		
		for(String s:arr) {
			str=str.replace(s, ".");
		}
		System.out.println(str.length());
		
//		for(String s:arr) {
//			if(s.contains("c")) {
//				cnt+=1;
//			}else if(s.contains("c-")) {
//				cnt+=1;
//			}else if(s.contains("c-")) { 
//				cnt+=1;
//			}else if(s.contains("lj")) {
//				cnt+=1;
//			}else if(s.contains("s=")) {
//				cnt+=1;
//			}else if(s.contains("nj")) {
//				cnt+=1;
//			}else if(s.contains("z=")) {
//				cnt+=1;
//			}else {
//				cnt+=1;
//			}
//		}
//		System.out.println(cnt);
		
	  
	}
}
