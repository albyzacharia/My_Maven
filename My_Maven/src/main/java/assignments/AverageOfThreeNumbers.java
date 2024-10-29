package assignments;

public class AverageOfThreeNumbers {
	public void averageThreeNumber(int a,int b,int c)
	{
		float d=((a+b+c)/3);
		System.out.println("Averageis: "+d);
	}
	public void averageThreeNumber(float a,float b,float c)
	{
		float d=((a+b+c)/3);
		System.out.println("Averageis: "+d);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AverageOfThreeNumbers obj=new AverageOfThreeNumbers();
		obj.averageThreeNumber(2, 8, 3);
		obj.averageThreeNumber(1.5f, 3.5f, 9.4f);

	}

}
