package week1;

public class ConstructorDemo {
	int id;
	String name;
	//designed defalut constructor
	public ConstructorDemo()
	{
		System.out.println("Student name is "+ name);
	    System.out.println("Student id is "+ id);
	}
	//Parametrized Constructor
	public ConstructorDemo(int i,String n)
	{
	id=i;
	name=n;
	System.out.println("id "+id);
	System.out.println("name "+name);
	}
	
	/* public void function()
	{
		System.out.println(id);
		System.out.println(name);
	}
*/
	
	public static void main(String[] args) {
		ConstructorDemo obj1= new ConstructorDemo(); //calling default constructor
		//obj1.function();	
		ConstructorDemo obj2=new ConstructorDemo(100,"kaveri"); 
	
	}

}
