
public class ShopingCart {
	  private PaymentStaregy paymentStrategy;
	  
	  public ShopingCart() {
	        this.paymentStrategy = new Cashpayment();
	    }
	    public void setPaymentStrategy(PaymentStaregy strategy) {
	        this.paymentStrategy = strategy;
	    }

	    public void checkout(int amount) {
	        paymentStrategy.pay(amount);
	    }

}
