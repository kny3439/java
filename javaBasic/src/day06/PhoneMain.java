package day06;

public class PhoneMain {

	public static void main(String[] args) {
		
		Phone phone=new Phone(); // 생성사
		phone.info();
		
		Phone red=new Phone("red");	
		red.info();
		
		Phone black=new Phone("black", 30000);
		black.info();
		
		Phone myPhone=new Phone("아이폰14", "white", 1000);
		myPhone.info();
		
		Phone myPhone1=new Phone("아이폰15", "Red", 5000);
		myPhone.info();	
		
	}
}
