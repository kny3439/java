package day09.poly.instanceof_;

public class Person {
	// 공통클래스(부모클래스)
	String name;
	int age;
	
	// 생성자 연결
	// 1. 중복되는 프로그램 코드를 생성자 연결을 통해 줄여줄 수 있다.
	// 2. this() 는 생성자의 첫번째 줄에 있어야 한다.
	
	Person(String name, int age){
		this.name=name;
		this.age=age;
		//System.out.println(this); // 나의 주소값
	}
	
	Person(String name){
		this(name,1);
	}
	Person(){
		this("나연",1);
	}
	
	String info() {
		return "이름: " + name + ", 나이: " + age;
	}
}
