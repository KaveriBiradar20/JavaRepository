package oop.DataAbstraction;

public class ChildAbstract extends AbstractDemo
{
	public void childM()
	{
		System.out.println("This is child class Individual method");
	}

	@Override
	public void show() 
	{
		System.out.println("show() is inherited abstract method" );
		System.out.println("show() implemented by child class");
	}
	
	public static void main(String[] args) 
	{
		ChildAbstract c1= new ChildAbstract();
		c1.accept();
		c1.childM();
		c1.show();
		
		System.out.println("*******Parent reference to Child Object******");
		AbstractDemo a1= new ChildAbstract();
		a1.accept(); 
		a1.show();
		
		//Parent ref and Parent Object is not possible in this case, because we
		// cant create Abstract Class Object
		// AbstractDemo a1=new AbstractDemo();
		
	}

}
