package oop.DataAbstraction;

public abstract class AbstractDemo 
{
	//implemented method
	public void accept()
	{
		System.out.println("this is implemented method");
	}
	//abstract method
	public abstract void show();
	
	public static void main(String args[])
	{
		//AbstractDemo a1=new AbstarctDemo(); we cant create the object bcz this class is not fully implemented
	}

}
