
public class Testdrive {
	public static void main(String[] args) {
		ShopingCart cart1 = new ShopingCart();
        cart1.checkout(1500);
        cart1.setPaymentStrategy(new CreditcardPayment());
        cart1.checkout(10000);
        cart1.setPaymentStrategy(new Scanpayment());
        cart1.checkout(100000);
    }
}
