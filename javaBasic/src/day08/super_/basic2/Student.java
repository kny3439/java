package day08.super_.basic2;

public class Student extends Person {

	String studentId;
	// 어노테이션 - 특정기능을 표현

	Student(String name, int age, String studentId) {
		super(name, age); // 부모님이 가지고 있는 name, age에 한번에 저장한다.
//		this.name=name;
//		this.age=age;
		this.studentId = studentId;
	}

	String info() {

		return super.info() + ", 학번: " + studentId;
	}

}
