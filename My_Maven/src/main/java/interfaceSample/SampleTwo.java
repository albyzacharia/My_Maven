package interfaceSample;

public class SampleTwo implements SampleOne {
	
	public void display()
	{
		System.out.println("display class");
	}
public void add()
{
	int c=a+b;
	System.out.println(c);
}
	public static void main(String[] args) {
		
		SampleTwo obj=new SampleTwo();
		obj.add();
		obj.display();

	}

}
