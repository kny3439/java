package api.util.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		
		Date date=new Date();
		System.out.println(date);
		
		// SimpleDateFormat - 날짜형 -> 문자형
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy년 MM일 dd일 a hh시 mm분 ss초 E요일");
		
		String result=sdf.format(date);
		System.out.println(result);
		
	}
}
