package accessSpecifier;

public class StudentTest {
	

	public static void main(String[] args) {
		
		Student obj=new Student();
		
		obj.display();
		System.out.println(obj.name);
		System.out.println(obj.sal);
		//System.out.println(obj.job);
		System.out.println(obj.msg);
		
		obj.display2();
		obj.display3();
		//obj.display1();
		

	}

}
