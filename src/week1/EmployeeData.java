package week1;

public class EmployeeData {
	//data
	int emp_id;
	String emp_name;
	float emp_sal;
	
	//Function
	public void display()
	{
	 System.out.println("Employee id is " + emp_id);
	 System.out.println("Employee name is " + emp_name);
	 System.out.println("Employee salary is " + emp_sal);
	}
     public static void main(String[] args){
    	 //data-1
		EmployeeData e1= new EmployeeData();
		e1.emp_id=1234;
		e1.emp_name="Kaveri";
		e1.emp_sal=34456.23f;
		e1.display();
        System.out.println("*******************************");
		EmployeeData e2= new EmployeeData();
		e2.emp_id=1235;
		e2.emp_name="SHREYA";
		e2.emp_sal=34488798;
		e2.display();
		System.out.println("*******************************");
		EmployeeData e3= new EmployeeData();
		e3.emp_id=1236;
		e3.emp_name="ADITI";
		e3.emp_sal=3442.23f;
		e3.display();
		System.out.println("*******************************");
		EmployeeData e4= new EmployeeData();
		e4.emp_id=1237;
		e4.emp_name="Milind";
		e4.emp_sal=34345.4f;
		e4.display();
		System.out.println("*******************************");
		EmployeeData e5= new EmployeeData();
		e5.emp_id=1238;
		e5.emp_name="Abhay";
		e5.emp_sal=3445.34f;
		e5.display();


	}

}
