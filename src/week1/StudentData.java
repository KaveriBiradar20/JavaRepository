package week1;

public class StudentData 

{
	int id;
	String name;
	
	public void show()
	{
		System.out.println("student id is " + id );
		System.out.println("Student name is " + name);
	}

	public static void main(String[] args) 
	{
	  StudentData s1=new StudentData();
	      s1.id=101;
	      s1.name="kaveri";
	      s1.show();
	      
	     StudentData s2= new StudentData();
	     s2.id= 102;
	     s2.name="Milind";
	     s2.show();
		

	}

}
