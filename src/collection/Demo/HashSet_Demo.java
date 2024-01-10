package collection.Demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSet_Demo 
{

	public static void main(String[] args) 
	{
		HashSet<Integer> hs=new HashSet<Integer>();
		System.out.println("is set is empty "+ hs.isEmpty());
		hs.add(10);
		hs.add(30);
		hs.add(20);
		hs.add(50);
		hs.add(30);
		System.out.println("is set is empty "+ hs.isEmpty());
		System.out.println("total elements are " + hs.size());
		System.out.println(hs);
		hs.add(null);
		System.out.println(hs);
		System.out.println("is set contains 30? "+ hs.contains(30));
		hs.remove(30);
		
		System.out.println(hs);
//		hs.clear();
//		System.out.println(hs);
		
		System.out.println("****Iteration using iterator *******");
	Iterator<Integer> ir=	hs.iterator();
	while(ir.hasNext())
	{
		System.out.println(ir.next());
	}
	System.out.println("****Iteration using for each loop*******");
	for (Integer num:hs) 
	{
		System.out.println(num);
		
	}

	/*
	 * sort (Set to list)--->sort
	 * 1.using constructor
	 * 2.addAll()
	 * 
	 */
	
	//using constructor set to list
	
	List<Integer> list1=new ArrayList<Integer>(hs);
	
	System.out.println(list1);
	
	//sort
	
	Collections.sort(list1);
	
	System.out.println(list1);
	
	//using addAll()
	
	List<Integer> list2=new ArrayList<Integer>();
	list2.addAll(hs);
	list2.add(100);
	System.out.println(list2);
	
	//Interview Question
	/*
	 * How to remove duplicates from list
	 * 
	 */
	
//	List<Integer> list3=new ArrayList<Integer>();
//	list3.add(10);
	
	
	//To generate quick list you can use Arrays class
	
	List<Integer> list3=Arrays.asList(10,20,30,40,20,10,50);
	System.out.println(list3);
	
	Set<Integer> set2=new HashSet<Integer>(list3);
	
	System.out.println(set2);
	
}

}
