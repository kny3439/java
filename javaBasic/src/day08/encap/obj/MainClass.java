package day08.encap.obj;

public class MainClass {

	public static void main(String[] args) {
		Hotel hotel = new Hotel();

		Chef c = new Chef();
		Employee emp= new Employee();
		
		// setter
		hotel.setChef(c);
		hotel.setEmp(emp);;

		// getter
		Chef chef = hotel.getChef();
		chef.cooking();
		
		Employee emp2=hotel.getEmp();
		emp2.working();
		

	}
}
