package baeckjoon;

import java.util.Scanner;

public class Problem04 {

	public static void main(String[] args) {
		
	    Scanner scan = new Scanner(System.in);
	      
	      int HH = scan.nextInt();
	      int MM = scan.nextInt();
	      
	      if(MM < 45) {
	         HH--;
	         MM= 60 - (45 - MM);
	         if(HH < 0) {
	            HH = 23;
	         }
	         System.out.println(HH + " " + MM);
	      }
	      else {
	         System.out.println(HH + " " + (MM - 45));
	      }
	      
	      scan.close();
	}
}
