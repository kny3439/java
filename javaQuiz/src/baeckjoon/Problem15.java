package baeckjoon;

import java.util.Scanner;

public class Problem15 {

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
	int balance;

	Problem15(String id, String passWord, int balance) {// 생성자 - 팥앙금
		this.id = id;
		this.passWord = passWord;
		this.balance = balance;
	} // 초기화

	void deposit() {

		Scanner scan = new Scanner(System.in);
		System.out.print("얼마를 입금?> ");
		int d = scan.nextInt();

		System.out.println("입금값> " + d);
		this.balance += d;
		System.out.println("잔액: " + this.balance);
	}

	int withDraw(int w) {

		return this.balance -= w;
	}

	Boolean isPassWord(String p_w) {

		if (passWord.equals(p_w)) {
			return true;
		} else {
			return false;
			
		}

	}

	int getBalance() {

		return balance;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}
