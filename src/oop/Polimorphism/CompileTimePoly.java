package oop.Polimorphism;

public class CompileTimePoly 
{
	public void add()
	{
		System.out.println("addition is " + (100+200));
	}
	// Method overloading..........
	public void add(int a, int b)
	{
		System.out.println("Addition is " + (a+b));
	}
	public void add(long a, int b)
	{
		System.out.println("Addition is " + (a+b));
	}
	public void add(int a, long b)
	{
		System.out.println("Addition is " + (a+b));
	}
	
	//Constructor Overloading
	CompileTimePoly()
	{
		System.out.println("This is default constructor");
	}
	
	CompileTimePoly(int id)
	{
		System.out.println("This is Parameterised constructor " + id);
	}
	
	CompileTimePoly(String name)
	{
		System.out.println("This is Parameterised constructor " + name);
	}
	CompileTimePoly(int id, String name)
	{
		System.out.println("This is Parameterised constructor " + id + name);
	}

	public static void main(String[] args) 
	{
		CompileTimePoly c1=new CompileTimePoly();
		c1.add();
		c1.add(10, 20);
		c1.add(1235,45);
		c1.add(14, 1000);
		
		CompileTimePoly c2=new CompileTimePoly(23);
		CompileTimePoly c3=new CompileTimePoly("kavya");
		CompileTimePoly c4=new CompileTimePoly(14, "kavya");
	

	}

}
