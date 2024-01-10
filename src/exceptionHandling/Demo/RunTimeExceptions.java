package exceptionHandling.Demo;

import java.util.Scanner;

public class RunTimeExceptions 
{
	 

	int id=101;

	public static void main(String[] args) 
	{
		
		RunTimeExceptions r1=new RunTimeExceptions();
		r1=null;  
		try {
		System.out.println("Id is "+r1.id);
		}
		catch(NullPointerException n)
		{
			System.out.println("Current class object is Null "+n.getMessage());
		}
	
	/*
	public static void main(String[] args) 
	{
		
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers ");
		int a= sc.nextInt();
		int b=sc.nextInt();
		System.out.println("addition is " + (a+b));
		System.out.println("Subtraction is " + (a-b));
		try
		{
		System.out.println("Division is " + (a/b));
		}
		catch(ArithmeticException e)
		{
			System.out.println("Please provide valid number for division "+e.getMessage());
		}
		
		System.out.println("Multiplication is " + (a*b));
		sc.close(); //memory leak will happen so it is good practice if we close the scanner class
	
	*/
	/*
	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Index between 0-5");
		int index=sc.nextInt();
		int arr[]= {10,20,30,40,50,60};
		try{
		 System.out.println(arr[index]);
		 }
		 catch(Exception e1)
		 {
		 System.out.println("Pls provide valid Index " + e1.getMessage());
		 }
		 sc.close();
		 */
	
		
	/*
		String s1="100ABC";
		try {
		int i= Integer.parseInt(s1);
		System.out.println(i);
		}
		catch(NumberFormatException n)
		{
			System.out.println("Pls provid evalid String ");
		}
		*/
	
	
		 
	}
	
	}

