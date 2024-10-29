package aggregation;

public class Book {
	String name;
	int year;
	Auother atr;
	
	public Book(String name,int year,Auother atr)
	{
	this.name=name;
	this.year=year;
	this.atr=atr;
	}
	public void display()
	{
		System.out.println("Book name:"+name);
		System.out.println("year:"+year);
		System.out.println("Auther Designation:"+atr.designation);
		System.out.println("Auther Name:"+atr.name);
		System.out.println("Place:"+atr.place);
	}

	public static void main(String[] args) {
		Auother obj=new Auother("Dr","Helen","India");
		Book obj1=new Book("All is Well",2022,obj);
		obj1.display();
		// TODO Auto-generated method stub

	}

}
