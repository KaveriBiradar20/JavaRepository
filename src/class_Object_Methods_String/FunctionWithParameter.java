package class_Object_Methods_String;

public class FunctionWithParameter 
{
	public void loginToGmail()  //zero parameterized method
	{
		String email="Kaveri@gmail.com";
		String pass="test123";
		System.out.println("emaqil id is: " + email);
		System.out.println("pass is " + pass);
	}
	public void loginToAmazon(String email,String pass)//method with 2 parameter i.e email and pass
	{
		System.out.println("User email is " + email);
		System.out.println("User pass is "+ pass);
		
	}
	
	public static void main(String[] args) 
	{
		FunctionWithParameter f1=new FunctionWithParameter();
		f1.loginToGmail(); // calling method with no arguments
		f1.loginToAmazon("kavya@gmil.com", "k1234"); //calling parameterized method
			
	}

}
