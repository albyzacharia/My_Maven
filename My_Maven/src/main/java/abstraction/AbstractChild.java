package abstraction;

public class AbstractChild extends AbstractParent {
	
	public void display()
	{
		System.out.println("Body of abstract method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractChild obj=new AbstractChild();
		obj.display();
		obj.show();
		System.out.println(obj.a);
		System.out.println(obj.b);

	}

}
