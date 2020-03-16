
public class Cashpayment implements Payment {
			double bal;
			
			public Cashpayment(double bal) {
				super();
				this.bal = bal;
			}

			public double payment(double amount)
			{
				return bal=bal-amount;
			}
}
