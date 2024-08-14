package superSample ;

public class Dog extends Animal {
String colour="Green";
public void print()
{
	System.out.println(colour);
	System.out.println(super.colour);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog obj=new Dog();
		obj.print();
		
		

	}

}
