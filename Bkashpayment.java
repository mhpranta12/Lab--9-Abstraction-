
public class Bkashpayment implements Payment{
		double bal;

		public Bkashpayment(double bal) {
			super();
			this.bal = bal;
		}
		public double payment(double amount)
		{
			return bal=bal-amount;
		}

}
	