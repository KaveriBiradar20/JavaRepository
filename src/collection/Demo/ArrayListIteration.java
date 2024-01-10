package collection.Demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListIteration {

	public static void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(100);
		al.add(40);
		al.add(30);
		al.add(10);
		al.add(20);
		al.add(30);
		System.out.println("****iteration using for loop*******");
		//iteration using for loop
		
		for(int i=0; i<al.size();i++) //or for(int i=0; i<=al.size()-1; i++
		{
			System.out.println(al.get(i));
		}
		System.out.println("***********Iteration using For-each loop******8");
		//iteration using for-each loop
		for(Integer i: al)
		{
			System.out.println(i);
		}
		
		System.out.println("******Iteration using iterator()***********");
		Iterator<Integer> ir=al.iterator();
		while(ir.hasNext())
		{
			System.out.println(ir.next());
			
		}
		//Sorting the list
		System.out.println("before sorting "+ al);
		Collections.sort(al);
		System.out.println("After sorting "+ al); 
	}

}
