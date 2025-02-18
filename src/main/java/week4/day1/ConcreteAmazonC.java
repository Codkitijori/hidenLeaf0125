package week4.day1;

public class ConcreteAmazonC extends CanaraBank implements Payments {

	@Override
	public void cashOnDelivery() {
		System.out.println("COD : from Payments");
	}

	@Override
	public void upiPayments() {
		System.out.println("UPI : from Payments");
	}

	@Override
	public void cardPayments() {
		System.out.println("Card Info : from Payments");
	}

	@Override
	public void internetBanking() {
		System.out.println("internetBanking info from : from Payments");
	}

	public static void main(String[] args) {

		ConcreteAmazonC amazonClass =new ConcreteAmazonC();
		amazonClass.cashOnDelivery();
		amazonClass.upiPayments();
		amazonClass.cardPayments();
		amazonClass.internetBanking();
		
		amazonClass.internetBanking();
		
	}

}
