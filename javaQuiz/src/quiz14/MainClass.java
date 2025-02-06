package quiz14;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		
		while(true) {
			String pay = scan.next();
			
			if (pay.equals("신용카드결제")) {
				Payment creditcardpayment = new CreditCardPayment();
				creditcardpayment.pay(500);
				boolean r=creditcardpayment.validatePaymentDetails("1234567891234567");
				System.out.println(r);
				break;
			} else if (pay.equals("페이팔결제")) {
				Payment paypalpayment = new PayPalPayment();
				paypalpayment.pay(1000);
				boolean r=paypalpayment.validatePaymentDetails("1234");
				System.out.println(r);
				break;
			}else {
				System.out.println("다시 작성해주세요.");
				System.out.println();
			}
			
		}

		scan.close();

	}
}
