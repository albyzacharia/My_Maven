package accessModifier1;

import accessSpecifier.Student;

public class StudentTest1 extends Student
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student obj1=new Student();
		System.out.println(obj1.name);
		System.out.println(obj1.age);
		obj1.display();
		//System.out.println(obj1.sal);
		//System.out.println(obj1.job);
		//System.out.println(obj1.msg);
		
		//obj1.display2();
		//obj1.display3();
		//obj1.display1();

	}

}
