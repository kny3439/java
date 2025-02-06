package day08.encap.good;

public class MainClass {

	public static void main(String[] args) {

		MyDate me = new MyDate();
		// me.setYear(2026);
		me.setYear(2025);

		int year = me.getYear();
		System.out.println("년도: " + year);
		
		me.setMonth(5);
		int month=me.getMonth();
		System.out.println("월: "+ month);
		
		me.setDay(14);
		int day=me.getDay();
		System.out.println("날짜: "+day);
		
		me.setSsn("12345123452134");
		String ssn=me.getSsn();
		System.out.println("번호: "+ssn);
		
	}
}
