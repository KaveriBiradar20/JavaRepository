package oop.Polimorphism;

public class AmazonPaymentTestClass {

	public static void main(String[] args) 
	{
		AmazonPayment apay=new AmazonPayment();
		apay.payment(500);
		apay.payment(500, "FIRST50");
		apay.payment("Googlepay", 500);
		apay.payment("ICICI",58236958L,500,235);
	}

}
