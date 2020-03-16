
public class Cardpayment implements Payment{
	double bal;
	
	public Cardpayment(double bal) {
		super();
		this.bal = bal;
	}

	public double payment(double amount)
	{
		return bal=bal-amount;
	}
}
