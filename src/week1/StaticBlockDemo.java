package week1;

public class StaticBlockDemo {
	
	static String cname="BKIT"; 
	static	
	{
		System.out.println("This is static Block");
		System.out.println("Static block is used to initialize static variable");
		cname="STARAGILE";
	}
	
	public static void main(String[] args) 
	
	{
	
	System.out.println("This is main function");
		System.out.println(cname);
		
	}

}
