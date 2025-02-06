package quiz02;

public class AccountMain {

	public static void main(String[] args) {
		
		Account account=new Account("나연","1234",1000);
		account.deposit(100);
		account.withDraw(100);
		account.getBalance(1000);
	}
}
 