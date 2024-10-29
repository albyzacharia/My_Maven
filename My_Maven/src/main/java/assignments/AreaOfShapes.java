package assignments;

public class AreaOfShapes {
	public void area(double a)
	{
		System.out.println("Areat of the Square: "+(a*a));
	}
	public void area(double a,double b)
	{
		System.out.println("Areat of the Rectangle: "+(a*b));
	}
	public void area1(String shape,double r)
	{
		System.out.println("Areat of the "+ shape+" is: "+(3.14*r*r));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaOfShapes obj=new AreaOfShapes();
		obj.area(5);
		obj.area(4, 3);
		obj.area1("Circle", 3);
	}

}
