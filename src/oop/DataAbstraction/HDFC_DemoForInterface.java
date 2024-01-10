package oop.DataAbstraction;

public class HDFC_DemoForInterface implements RBI_Interface
{
	public void customerDetails()
	{
		System.out.println("HDFC Customers details");
	}

	@Override
	public void deposit() 
	{
		
		System.out.println("Deposit method from HDFC");
	}

	@Override
	public void withdraw() 
	{
		System.out.println("Withdraw from HDFC");
		
		
	}

	@Override
	public void rateOfInterest() 
	{
		System.out.println("HDFC Rate Of Interest 8%");
		
	}

}
