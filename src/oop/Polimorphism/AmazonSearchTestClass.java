package oop.Polimorphism;

public class AmazonSearchTestClass {

	public static void main(String[] args) 
	{
		AmazonSearch as=new AmazonSearch();
		as.search(150);
		as.search("iphoine");
		as.search("bag", 500);
		as.search("Zara", "bag");

	}

}
