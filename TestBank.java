
public class TestBank {

	public static void main(String[] args) {
		Bank c =new HSBC (2500);
		System.out.println(c.getInterest());
		Bank g=new BRAC (20000);
		System.out.println(g.getInterest());

	}

}
