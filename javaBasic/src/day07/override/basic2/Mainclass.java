package day07.override.basic2;

public class Mainclass {

	public static void main(String[] args) {
		
		Person p=new Person(); // 그렇게 많이 쓸 일은 없다.
		p.name="홍길동";
		p.age=20;
		System.out.println(p.info());
		
		// 상속받은 자식클래스들
		Student s=new Student();
		s.name="이순신";
		s.age=30;
		s.studentId="123123";
		System.out.println(s.info());
		
		Teacher t=new Teacher();
		t.name="홍길자";
		t.age=40;
		t.subject="역사";
		System.out.println(t.info());
		
		Employee e= new Employee();
		e.name="쬬";
		e.age=50;
		e.department="회계";
		System.out.println(e.info());
				
	}
}
