
public class Chequepayment implements Payment {
	double bal;

	public Chequepayment(double bal) {
		super();
		this.bal = bal;
	}
	public double payment(double amount)
	{
		return bal=bal-amount;
	}
}
