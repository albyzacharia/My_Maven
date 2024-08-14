package inheritence;

public class MultiChild extends MultiParent{
	
	public void mul()
	{
	int m=a*b;
	System.out.println(m);
	}

	public static void main(String[] args) {
		
		MultiChild obj=new MultiChild();
		obj.mul();
		obj.sub();
		obj.display();

	}

}
