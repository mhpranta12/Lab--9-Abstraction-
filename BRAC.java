
public class BRAC extends Bank {
		double balance;

		public BRAC(double balance) {
			super();
			this.balance = balance;
		}
		public double getInterest()
		{
			
			return balance *0.30;
		}
}
