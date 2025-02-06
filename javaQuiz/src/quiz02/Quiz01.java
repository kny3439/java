package quiz02;

public class Quiz01 {

	String companyName;
	int channel;
	Boolean power;
	
	Quiz01(){
		companyName="LG";
	
		
	}
	
	void info() {
		System.out.println("---tv정보---");
		System.out.println("회사명: " + companyName);
		System.out.println("채널번호: " + channel);
		System.out.println("전원: " + power);
	}
	
	int changeChannel(int ch) {
		channel=ch;
		System.out.println("현재채널: " + channel);
		return channel;
	}
	void power() {
		
		power=!power;
		
		if(power) {
			System.out.println("전원: on" );
		}else {
			System.out.println("전원: off" );
		}
		
	}
	
}
