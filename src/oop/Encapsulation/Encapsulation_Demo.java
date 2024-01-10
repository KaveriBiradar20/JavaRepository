package oop.Encapsulation;
class Employee
{
	//data-hide
	private int id=101;
	private String name="meeta";
	
	// Authorised user can update or access the private data by Public method for that data
	//with the help of getter(), and setter()
	
	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}
	
	//Business logic
	public void show()
	{
		System.out.println("Employee id is :" +id);
		System.out.println("Employee name is :" + name);
	}

	
	
}


public class Encapsulation_Demo {

	public static void main(String[] args) 
	{
		Employee e1=new Employee();
		e1.show();
		//e1.id=201;  // The field Employee.id is not visible
		//e1.name="kavya";
		//to access private data use getter(), setter()
		e1.setId(201);
		e1.setName("kavya");
		e1.show();
		//0r 
		System.out.println(e1.getId() + " " + e1.getName());
        e1.show();		

	}

}
