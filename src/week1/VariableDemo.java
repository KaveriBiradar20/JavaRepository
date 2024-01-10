package week1;

public class VariableDemo {
	
	int id; //instance variable
	static String comp_Name="Star Agile";
	
	public void display()
	{
		int marks=100; //local
		System.out.println("Marks from display() " + marks);
		System.out.println("Student id is " + id);
		System.out.println("Company name is " + comp_Name);
	}

	public static void main(String[] args) {
		int marks=100; //local
		System.out.println("Marks from main() " +marks);
		
VariableDemo v1=new VariableDemo();
v1.display();
v1.id=101;
System.out.println("Student id displays in main " + v1.id);
System.out.println("Company name is " + comp_Name);
	}

}
