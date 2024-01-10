package week1;

public class MethodDemo 
{
	public void startApp()
	{
		System.out.println("Instance method calling");
	}
	
	public static void runApp()
	{
		System.out.println("Static method is calling");
	}

	public static void main(String[] args) 
	{
		runApp();
		MethodDemo.runApp();// to craete any reusable code we can call by class name
		MethodDemo m1=new MethodDemo();
		m1.startApp();

	}

}
