package quiz12;

public class MainClass {

	public static void main(String[] args) {
		
		Shape rect=new Rect("ㅁ",4);
		System.out.println(rect.getName());
		System.out.println(rect.getArea());
		
		Shape circle=new Circle("ㅇ",3);
		System.out.println(circle.getName());
		System.out.println(circle.getArea());
		
	}
}
