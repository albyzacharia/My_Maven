package assignments;

import java.util.Scanner;

public class AreaOfShapesCommandLine {
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
		AreaOfShapesCommandLine obj=new AreaOfShapesCommandLine();
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Choose the shape to calculate the area:");
	        System.out.println("1. Rectangle");
	        System.out.println("2. Square");
	        System.out.println("3. Circle");
	        System.out.print("Enter your choice (1, 2, or 3): ");
	        int choice = scanner.nextInt();
	        switch (choice) {
            case 1:
            	obj.area(scanner.nextDouble(), scanner.nextDouble());
            	break;
            case 2:		
            	obj.area(5);
            	break;
            case 3:            		
            	obj.area1("Circle", 3);
            	break;
	        }
	}

}
