package quiz21;

public class Data {
	
	private String name;
	private String email;
	private String age;
	private String address;

	public Data(/*String name, String email, int age, String address*/) {
//		this.name=name;
//		this.email=email;
//		this.age=age;
//		this.address=address;
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String str) {
		this.age = str;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+", "+age+", "+email+", "+address;
	}
	
}
