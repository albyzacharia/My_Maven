package inheritence;

public class SingleChild extends SingleParent{
	public void sub()
	{
		int d=b-a;
		System.out.println(d);
	}

	public static void main(String[] args) {
	SingleChild obj=new SingleChild();
	obj.display();
	obj.sub();

	}

}
