package assignments;
import java.util.*;

public class ArrayListAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String>al=new ArrayList<String>();
		al.add("Yellow");
		al.add("Green");
		al.add("Red");
		al.add("pink");
		al.add("Blue");
		System.out.println(al);
		String g=al.get(2);
		System.out.println(g);
		Iterator<String> it=al.iterator();
		while (it.hasNext())
		{
			String d=it.next();
			if(d=="Blue")
			{
				System.out.println("Blue available");	
			}
			
		}
		al.remove(2);
		System.out.println(al);
		boolean c=al.contains("Blue");
		System.out.println(c);
		
	
	}

}
