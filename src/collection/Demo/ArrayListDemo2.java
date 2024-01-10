package collection.Demo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {

	public static void main(String[] args) 
	{
		ArrayList<Object> obj=new ArrayList<Object>();
		obj.add(101);
		obj.add("kaveri");
		obj.add('M');
		obj.add(89.78);
		obj.add(2345678L);
		System.out.println(obj);
		Object num=obj.get(0);
		System.out.println(num);
		System.out.println("****Iteration using Iterator() method**********");
		
		Iterator<Object> ir=obj.iterator();
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
		
		
	
	}

}
