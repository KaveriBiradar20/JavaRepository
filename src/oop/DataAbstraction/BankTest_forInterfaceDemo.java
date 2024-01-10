package oop.DataAbstraction;

public class BankTest_forInterfaceDemo 
{

	public static void main(String[] args) 
	{
		HDFC_DemoForInterface h1= new HDFC_DemoForInterface();
		h1.customerDetails();
		h1.deposit();
		h1.rateOfInterest();
		h1.withdraw();
		System.out.println("***********");
		
		Axis_DemoForInterface a1=new Axis_DemoForInterface();
		a1.customerDetails();
		a1.deposit();
		a1.rateOfInterest();
		a1.withdraw();
	}

}
