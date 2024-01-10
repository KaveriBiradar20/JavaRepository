package oop.Inheritance;

public class Child extends Parent
{
	int cid=201;
	
	public void childIncome()
	{
		System.out.println("Parent id is :" +pid);
		System.out.println("Parent id is :" +super.pid);
		super.parentIncome();
		System.out.println("child id is "+ cid);
		System.out.println("Child income is 30k");
	}
	public Child()
	{
		super();
		System.out.println("It is defalut Constructor from child");
	}
	

	public static void main(String args[])
	{
		Child c1=new Child();
		c1.childIncome();
	
		
			
	}

}
