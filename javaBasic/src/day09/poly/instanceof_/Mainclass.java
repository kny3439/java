package day09.poly.instanceof_;

public class Mainclass {

	public static void main(String[] args) {

		Person hong = new Student("홍길동", 10, "123");
		Person park = new Student("박찬호", 20, "체육");
		Person choi = new Student("최강창민", 30, "가수");

		printPerson(park);
		
	}

	public static void printPerson(Person p) {
		
		// p가 Student였으면 Student캐스팅
		// p가 Teacher였으면 Teacher캐스팅
		
		if(p instanceof Student) { // p가 student였으면 true
			Student s=(Student)p;
			System.out.println("p는 원래 Student였음");
			System.out.println(s.info());
			
		}else if(p instanceof Teacher) {
			Teacher t=(Teacher)p;
			System.out.println("p는 원래 Teacher였음");
			System.out.println(t.info());
			
		}else if(p instanceof Employee) {
			Employee e=(Employee)p;
			System.out.println("p는 원래 Employee였음");
			System.out.println(e.info());
			
		}
		
	}
}
