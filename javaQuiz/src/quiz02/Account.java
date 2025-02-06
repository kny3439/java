package quiz02;

import java.util.Scanner;

public class Account {
	
	/*
	 * Account클래스
	 * 
	 * 멤버변수 이름 - String 비밀번호 - String 잔액 - int
	 * 
	 * 생성자 (이름, 비밀번호, 잔액) 을 받아서 초기화 해주는 생성자 1개
	 * 
	 * 메서드 입금기능 - deposit(int) : 반환 void - 잔액에 매개변수를 누적하는 기능 출금기능 - withDraw(int) :
	 * 반환 int - 사용자에게 비밀번호를 입력받아서, 비밀번호가 일치하면, 잔액을 차감해하고, 출금값을 반환하는 기능 문자열의 비교
	 * "문자열".equals("문자열")* 잔액조회 - getBalance() : 반환 int - 잔액을 반환하는 기능
	 * 
	 */

	String id;
	String passWord;
	int deposit;

	Account(String name, String PW, int de) {
		id = name;
		passWord = PW;
		deposit = de;
	}

	void deposit(int d) {
		System.out.println("이름: " + id);
		System.out.println("비밀번호: " + passWord);
		System.out.println("잔액: " + deposit);

		deposit += d;
		System.out.println(d + "원 입금 후 잔액: " + deposit);
	}

	int withDraw(int w) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("비밀번호> ");
		String p_w = scan.next();

		if (p_w.equals(passWord)) {
			deposit -= w;
		}else {
			System.out.println("비밀번호가 틀렸습니다");
		}

		System.out.println("출금 한 금액: " + w);
		return w;
	}

	int getBalance(int g) {
		g = deposit;
		System.out.println("잔액조회: " + g);
		return g;

	}

}
