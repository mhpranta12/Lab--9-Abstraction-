
public class Circle extends Shape {
				private int r;

				public Circle(String color, int r) {
					super(color);
					this.r = r;
				}
				public double getArea()
				{
					return 3.1416*r*r;
				}
				
			
}
