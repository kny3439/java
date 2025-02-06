package baeckjoon;

import java.util.Scanner;

public class Problem15Main {

	public static void main(String[] args) {
		
		Problem15 p1 = new Problem15("kny3439", "1234", 1000);
		String id = p1.getId();
		String passWord = p1.getPassWord();
		int balance = p1.getBalance();
		
		System.out.println("이름: " + id);
		System.out.println("비밀번호: " + passWord);
		System.out.println("잔액: " + balance);
		
		System.out.println();
		
		//p1.deposit();
		
		System.out.println();
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println();
		System.out.println("1.입금 2.출금");
		int menu=scan.nextInt();
		
		while(true) {
	
			System.out.print("비밀번호> ");
			String pw = scan.next();
			
			if(p1.isPassWord(pw)) {
				
				switch (menu) {
				case 1:
					p1.deposit();
					break;
				case 2:
					System.out.println("출금 할 금액> ");
					int w=scan.nextInt();
					System.out.print(p1.withDraw(w));
					p1.withDraw(w);
					break;

				default:
					System.out.println("메뉴를 다시 입력해주세요.");
					break;
				}
				
				break;
			}else {
				System.out.println("비밀번호가 틀렸습니다.");
				
			}	
			
		}
			
//		p1.withDraw(100);
		
		
		System.out.println();
		System.out.println();
		System.out.print("잔액 조회> ");
		int r=p1.getBalance();
		System.out.println(r);
		
	}
}
