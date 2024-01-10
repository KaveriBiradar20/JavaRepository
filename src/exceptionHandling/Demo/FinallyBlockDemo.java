package exceptionHandling.Demo;

public class FinallyBlockDemo {

	public static void main(String[] args) 
	{
		System.out.println("Program started");
		try
		{
			System.out.println("Division is "+(9/0));
		}
		catch(Exception e)
		{
			System.out.println("Pls provide valid number for division");
		}  
		
		finally
		{
			System.out.println("Test Completed");
		}
		
		    System.out.println("Program ended");
	}

}
