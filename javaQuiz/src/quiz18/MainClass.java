package quiz18;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		/*
		 * 띄어쓰기 기분으로 데이터 입력이 들어올 떄, 정수 배열에 저장하기
		 * 
		 * 
		 * 54 32 43 52 75
		 * 
		 * nextLine()으로 받아서, split()으로 쪼개고, parseInt로 반환 후
		 * 정수 배열에 저장
		 * */
		
		Scanner sc=new Scanner(System.in);
		
		String str=sc.nextLine();
		String[]arr=str.split(" ");
		int[]arr2=new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			int r=Integer.parseInt(arr[i]);
			arr2[i]=r;
		}
		
		System.out.println(Arrays.toString(arr2));
		
		
	}
}
