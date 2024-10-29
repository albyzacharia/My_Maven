package assignments;

public class AddressAggregation {
	StudentAggregation nr;
	String place; String distr; int pin;int mob;
	public AddressAggregation(StudentAggregation nr,String place, String distr, int pin,int mob)
	{
		this.distr=distr;
		this.place=place;
		this.pin=pin;
		this.mob=mob;
		this.nr=nr;
		}
	public  void display()
	{
		System.out.println("Student details: "+nr.name+","+nr.rollno +","+distr+","+place+","+pin+","+mob);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentAggregation obj=new StudentAggregation("alby",01);
		AddressAggregation obj1=new AddressAggregation(obj,"palace rd","Ernakulam",6582,128465154);	
		obj1.display();
		
	}

}
