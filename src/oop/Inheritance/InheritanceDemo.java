package oop.Inheritance;

class A
{
	public void m1()
	{
		System.out.println("m1 is calling from A");
	}
	
}

class B extends A  //Single level
{
	public void m2()
	{
		System.out.println("m2 is calling from B");
	}
	
}

class C extends B  //Multilevel
{
	public void m3()
	{
		System.out.println("m3 is calling from C");
	}
}
class D extends A //Hierarchical Inheritance
{
	public void m4()
	{
		System.out.println("m4 is calling from D");
	}
}

public class InheritanceDemo 
{

	public static void main(String[] args) 
	{
		//Parent class reference and Parent class object
		
		A a1=new A();
		a1.m1();
		
	/*  A a2=new B(); // it is possible but we can acces only parent class methods,
		child class method we cant access by parent referrence
	*/
		
	System.out.println("************");
	// child class reference and  child Object
		B b1=new B();
		b1.m2();  //Individual method
		b1.m1();  //Inherited method
	    // Creating Object for Class C
		
	System.out.println("****************");
		
		C c1=new C();
		c1.m1(); //Inherited method
        c1.m2(); //Inherited method
        c1.m3(); //Individual method
        
      System.out.println("***********");
      
      D d1= new D();
      d1.m1();
      d1.m4();
		


	}

}
