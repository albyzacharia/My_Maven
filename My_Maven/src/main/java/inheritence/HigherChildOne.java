package inheritence;

public class HigherChildOne extends HigherParent{
	
	public void sub()
	{
		int d=b-a;
		System.out.println(d);
	}

	public static void main(String[] args) {
		HigherChildOne obj=new HigherChildOne();
		obj.sub();
		obj.display(); 
		// TODO Auto-generated method stub

	}

}
