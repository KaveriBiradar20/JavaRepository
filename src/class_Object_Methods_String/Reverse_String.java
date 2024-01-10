package class_Object_Methods_String;

public class Reverse_String 
{

	public static void main(String[] args) 
	{
		
		/*
		 * Java provides two predefined mutable class-don't work with literal
		 * String Buffer                StringBuilder
		 * Synchronize					non synchronize
		 * 
		 * At a time one process		At a time multiple process it can handle
		 * 
		 * These class provides methods to reverse() a string
		 * 
		 * String is immutable and in String we don't have reverse() 
		 * 
		 */
		
		StringBuilder sb=new StringBuilder("Hello");
		
		//StringBuffer b="hello"; //literal way is not allowed for this class
		
		sb.append("All");
		
		System.out.println(sb);
		System.out.println("Reverse is:"+ sb.reverse());
		
		System.out.println("*****************************");
		
		String ss5="Java selenium";
		String res="";
		for(int i=ss5.length()-1;i>=0;i--)
		{
			res=res+ss5.charAt(i);
		}
		
		System.out.println("Reverse of "+ss5+" is="+res);
		
	}

}
