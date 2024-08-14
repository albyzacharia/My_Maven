package accessSpecifier;

public class Student {
	public String name="Alby";
	public int age=25;
	private String job="Teacher";
	protected int sal=10000;
	String msg="All is Well";
	
	public void display()
	
	{
		System.out.println("Hi World");
	}
private void display1()
	
	{
		System.out.println("Private Method");
	}
protected void display2()

{
	System.out.println("Protected Method");
}
void display3()

{
	System.out.println("Default Method");
}
	
public static void main(String args[])
{
	Student obj1=new Student();
	System.out.println(obj1.name);
	System.out.println(obj1.age);
	System.out.println(obj1.job);
	System.out.println(obj1.sal);
	System.out.println(obj1.msg);
	obj1.display();
	obj1.display1();
	obj1.display2();
	obj1.display3();
	
}
}

