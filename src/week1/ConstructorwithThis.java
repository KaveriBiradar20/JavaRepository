package week1;

public class ConstructorwithThis 
{
	int id;
	String name;
	
	//Designed Parameterized Constructor
	public ConstructorwithThis(int id, String name) //local variable
	{
	//	assigning local var to Instance or current class Variable
	this.id=id;
	this.name=name; 
	}
	
	
	  public void show() { System.out.println("Student id is "+ id);
	  System.out.println("Student name is "+ name); }
	 
	public static void main(String[] args) 
	{
		
		ConstructorwithThis obj=new ConstructorwithThis(100,"kavya");
	    obj.show();
	}

}
