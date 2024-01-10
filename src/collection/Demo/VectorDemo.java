package collection.Demo;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo 
{

	public static void main(String[] args) 
	{
		Vector<Integer> v1=new Vector<Integer>();
		System.out.println("Is list is Empty..? "+ v1.isEmpty());
		
		if (v1.isEmpty())
		{
			v1.add(80);
			v1.add(10);
			v1.add(30);
			v1.add(80);
			v1.add(50);
			
		}
		System.out.println(v1);
		System.out.println("Total elements are " +v1.size()); 
		
		System.out.println("******Iteration*********");
		for(Integer i:v1)
		{
			System.out.println(i);
		}
		System.out.println("****using iterator method********");
		Iterator <Integer> ir=v1.iterator();
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
		
	
		

	}

}
