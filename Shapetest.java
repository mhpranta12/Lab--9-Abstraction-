public class Shapetest
{
public static void main(String[] args)
{
			Shape r =new Triangle("RED",25,25);
			
			System.out.println(r.getArea());
			System.out.println(r);
			
			Shape c =new Circle("Green",2);
			System.out.println(c.getArea());
}
}
