package day08.super_.basic1;

public class Parent {

	String father;
	String mother;
	
	void info(){
		System.out.println("아버지"+this.father);
		System.out.println("어머니"+this.mother);
	}
	
	Parent(String father, String mother){
		this.father=father;
		this.mother=mother;
	}
}
