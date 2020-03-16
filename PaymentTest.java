
public class PaymentTest {

	public static void main(String[] args) {
		Payment k=new Cashpayment(2000);
		System.out.println(k.payment(100));
		Payment l=new Cardpayment(2000);
		System.out.println(l.payment(200));
		Payment o=new Chequepayment(2000);
		System.out.println(o.payment(300));
		Payment b=new Bkashpayment(2000);
		System.out.println(b.payment(500));
	}

}
