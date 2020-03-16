
public class HSBC extends Bank{
			double balance ;

			public HSBC(int balance) {
				super();
				this.balance = balance;
			}
			public double getInterest()
			{
				
				return balance *0.25;
			}
		
}
