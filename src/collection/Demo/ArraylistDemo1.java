package collection.Demo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistDemo1 {

	public static void main(String[] args) 
	{
		//Generic way
		ArrayList<Integer> a1= new ArrayList<Integer>();
		a1.add(20);
		a1.add(10);
		a1.add(70);
		a1.add(20);
		System.out.println(a1);
		int num=a1.get(0);
		System.out.println(num);
		System.out.println("**********");
		ArrayList<String> loc=new ArrayList<String>();
		loc.add("Pune");
		loc.add("Mumbai");
		loc.add("Nagpur");
		System.out.println(loc);
		System.out.println("****Iteration using Iterator method*****");
		   Iterator<String> ir = loc.iterator();
		   while(ir.hasNext())
		   {
			   System.out.println(ir.next());
		   }
		
		
		/*
		 * //Non generic way
		 * 
		 * ArrayList a1= new ArrayList(); 
		 * a1.add(100); 
		 * a1.add('M'); 
		 * a1.add("Sarang");
		 * a1.add(89.67); 
		 * System.out.println(a1);
		 * 
		 * System.out.println(a1.get(0)); 
		 * int num = (int) a1.get(0);
		 * System.out.println(num);
		 *  
		 */


	}

}
