package superSample;

public class DogMethod extends AnimalMethod {
	
	public void eat()
	{
		System.out.println("Drink ");
		super.eat();
	}
	public void drink()
	{
		System.out.println("All is Well");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DogMethod obj=new DogMethod();
		obj.eat();
		obj.drink();
		

	}

}
