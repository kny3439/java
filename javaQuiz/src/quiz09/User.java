package quiz09;

public class User {

	private String name;
	private int rrn;
	private int age;

	User() {

	}

	User(String name, int rrn, int age) {
		this.name = name;
		this.rrn = rrn;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRrn() {
		return rrn;
	}

	public void setRrn(int rrn) {
		this.rrn = rrn;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name+" "+rrn+" "+age;
	}
}
