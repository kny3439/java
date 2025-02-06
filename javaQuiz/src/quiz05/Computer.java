package quiz05;

public class Computer extends Calculator {


	double rect(double a){
		return a*a;
	}
	
	double rect(double a, double b) {
		return a*b;
	}
	
	double rect(double a, double b, double c) {
		return a*b*c;
	}
	
	
	double circle(int a) {
		
		return Math.PI*a*a;
	}
}
