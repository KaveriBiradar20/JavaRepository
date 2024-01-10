package collection.Demo;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) 
	{
		LinkedList<Integer> l1=new LinkedList<Integer>();
		l1.add(10);
		l1.add(50);
		l1.add(60);
	
		l1.add(50);
		l1.add(20);
		System.out.println("Total elements are "+ l1.size());
		System.out.println(l1);
		System.out.println(l1.contains(50));
		System.out.println(l1.contains(100));
		
		//extra method of Linked list are
		// addFirst(), addLast(), getFirst(), getLast()
		l1.addFirst(50);
		l1.addLast(50);
		System.out.println(l1);
		System.out.println(l1.getFirst());
		System.out.println(l1.getLast());
		l1.remove(5);
		System.out.println(l1);
		
		System.out.println("*********Iteration********");
		for(Integer i:l1)
		{
			System.out.println(i);
		}
		
		
	}

}
