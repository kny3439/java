package quiz14;

public class PayPalPayment implements Payment {

	public String PIN="1234";
	
	@Override
	public void pay(int amount) {
		System.out.println("PayPal로 " + amount + "원을 결제합니다.");

	}

	@Override
	public boolean validatePaymentDetails(String PIN) {
		if (this.PIN == PIN) {
			System.out.println("PIN번호가 일치합니다");
			return true;
		} else {
			return false;
		}

	}

}
