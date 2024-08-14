package inheritence;

public class HigherChildTwo extends HigherParent {
	public void mul()
	{
	int m=a*b;
	System.out.println(m);
	}

	public static void main(String[] args) {
		HigherChildTwo obj= new HigherChildTwo();
		obj.mul();
		obj.display();
		// TODO Auto-generated method stub

	}

}
