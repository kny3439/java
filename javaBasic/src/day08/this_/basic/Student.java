package day08.this_.basic;

public class Student extends Person {

	String studentId;
	 // 어노테이션 - 특정기능을 표현
	String info() {
		
		return "이름: "+name+", 나이: "+age+", 학번: "+ studentId;
	}

}
