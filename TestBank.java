
public class TestBank {

	public static void main(String[] args) {
		Bank c =new HSBC (20000);
		System.out.println(c.getInterest());
		Bank g=new BRAC (20000);
		System.out.println(g.getInterest());
		System.out.println("Interest for this amount in HSBC Bank : "+c.getInterest());
		System.out.println("Interest for this amount in BRAC Bank : "+g.getInterest());
	}

}
