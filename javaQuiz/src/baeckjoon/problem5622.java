package baeckjoon;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class problem5622 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		String[] strArr = str.split("");
		
//		System.out.println(Arrays.deepToString(strArr));

		int total = 0;

//		String[][] arr = { { "ABC" }, { "DEF" }, { "GHI" }, { "JKL" }, { "MNO" }, { "PQRS" }, { "TUV" }, { "WXYZ" } };
//		System.out.println(Arrays.deepToString(arr));
//		
//		for (int i = 0; i < strArr.length; i++) {
//
//			for (int j = 0; j < arr[i].length; j++) {
//				
//				char c = arr[i][j].charAt(j);
//
//				if (arr[i][j].contains(strArr[i])) {
//					
//					total += j + 3;
//
//				}
//
//			}
//		}
//
//		System.out.println(total);
		

		
		
		for(int i=0; i<strArr.length; i++) {
			
			switch (strArr[i]) {
			case "A": case"B": case"C":
				total += 3;
				break;
			case "D": case"E": case"F":
				total += 4;
				break;
			case "G": case"H": case"I":
				total += 5;
				break;
			case "J": case"K": case"L":
				total += 6;
				break;
			case "M": case"N": case"O":
				total += 7;
				break;
			case "P": case"Q": case"R":case"S":
				total += 8;
				break;
			case "T": case"U": case"V":
				total += 9;
				break;
			case "W": case"X": case"Y":case"Z":
				total += 10;
				break;

			default:
				break;
			}
			
			
		}
		
		System.out.println(total);
		
		

		sc.close();

	}
}
