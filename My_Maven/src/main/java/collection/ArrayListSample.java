package collection;

import java.util.ArrayList;

public class ArrayListSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>sl=new ArrayList<String>();
		sl.add("Mobile");
		sl.add("Laptop");
		sl.add("PC");
		System.out.println(sl);
		sl.add(0, "Tablet");
		System.out.println(sl);
		sl.set(1, "iPhone");
		System.out.println(sl);
		sl.remove(3);
		System.out.println(sl);
		for(int i=0;i>sl.size();i++)
		{
		
		System.out.println(sl.get(i));
		}
		
		ArrayList<Integer>il=new ArrayList<Integer>();
		il.add(58);
		il.add(48);
		il.add(38);
		System.out.println(il);
		int v=il.get(0);
		System.out.println(v);
		int s=il.size();
		System.out.println(s);
				
		
		

	}

}
