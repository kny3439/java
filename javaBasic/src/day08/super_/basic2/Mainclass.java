package day08.super_.basic2;

public class Mainclass {

	public static void main(String[] args) {

		Student s = new Student("홍길동", 20, "123456");

		System.out.println(s.info());

		// teacher, Employee도 생성자를 만들고, 객체 생성 해주세요.
		Teacher t = new Teacher("홍길자", 30, "과학");
		System.out.println(t.info());

		Employee e = new Employee("홍", 40, "영업");
		System.out.println(e.info());

	}
}
