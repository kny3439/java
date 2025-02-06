package day08.encap.good;

public class MyDate {

	private int year;
	private int month;
	private int day;
	private String ssn;

	// 은닉(가려진) 변수에 접근 할 때, 미리 생성해 놓은 getter/setter 를 사용한다.
	// setter메서드 선언
	// 1. 은닉 변수에 값을 저장하기 위한 메서드
	// 2. 접근 제어자를 public으로 선언하고 이름 (set + 멤버변수명) 으로 만든다.

	public void setYear(int year) {
		// 유효성 검증 내용을 추가 할 수도 있다.

		if (year < 1950 || year > 2025) {
			System.out.println("잘못된 값 입력 입니다.");
			return;
		}
		this.year = year;
	}

	// 1. 은닉 변수에 값을 조회하기 위한 메서드
	// 2. 접근 제어자 public으로 하고 이름 (get + 멤버변수명) 으로 만든다.

	public int getYear() {
		// 유효성 검사를 할 수도 있다.
		return year;
	}

	/*
	 * month, day, ssn에 대한 getter, setter 를 생성
	 * 
	 * month - 1~12월 까지만 저장 day - 1~30일 까지만 저장 ssn - 문자열 13자리 까지만 저장
	 * 
	 */

	public void setMonth(int month) {
		if (month > 0 || month <= 12) {
			this.month = month;
		} else {
			System.out.println("잘못된 날짜 입력입니다.");
		}
	}

	public int getMonth() {

		return month;
	}

	public void setDay(int day) {

		if (day > 0 || day <= 30) {
			this.day = day;
		} else {
			System.out.println("잘못된 날짜 입력입니다.");
		}
	}

	public int getDay() {
		return day;
	}

	public void setSsn(String ssn) {
		if (ssn.length() > 13) {
			System.out.println("잘못된 주민등록번호 입력입니다.");
			
		}

		this.ssn = ssn;

	}

	public String getSsn() {
		return ssn;
	}
}
