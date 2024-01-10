package collection.Demo;

import java.util.ArrayList;

public class CollectionMethodsDemo {

	public static void main(String[] args)
	{
		ArrayList <Integer> al= new ArrayList<Integer>();
			
		System.out.println("Is your List empty?..... " + al.isEmpty());//true
		al.add(80);
		al.add(20);
		al.add(30);
		al.add(70);
		al.add(20);
		System.out.println("After adding the element Is your List empty?..... " + al.isEmpty());
		System.out.println("total elements are :"+ al.size());
		System.out.println(al.get(4));
		System.out.println(al.size());
		System.out.println(al);
		//to insert the element in the list
		al.add(3,50);
		System.out.println(al);// updated list
		al.remove(3);
		System.out.println(al);
		//al.clear();
		System.out.println(al);
		al.add(null);
		al.add(null);
		System.out.println(al);
		
		
		
	}

}
