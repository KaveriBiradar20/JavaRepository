package oop.DataAbstraction;

public class Axis_DemoForInterface implements RBI_Interface
{
	public void customerDetails()
	{
		System.out.println("AXis Customer Details");
	}
	@Override
	public void deposit()
	{
		System.out.println("Deposit from Axis");
	}
	@Override
	public void withdraw()
	{
		System.out.println("Withdraw from Axis");
	}
	@Override
	public void rateOfInterest()
	{
		System.out.println("Axis rate of Interest is 9%");
	}

}
