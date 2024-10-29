package polyMorphism;

public class ChildPolymorphism extends ParentPolymorphism{
	public void display()
	{
		System.out.println("Child Class Printed");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ChildPolymorphism obj=new ChildPolymorphism();
		obj.display();
		ParentPolymorphism obj1=new ParentPolymorphism();
		obj1.display();*/
		ParentPolymorphism obj=new ChildPolymorphism();
		obj.display();	}

}
