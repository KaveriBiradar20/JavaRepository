package week1;

public class WrapperClassDemo {

	public static void main(String[] args) {
	
        // To store primitive data in the form of object
		// To Convert object into primitive we use Wrapper Class
		String s1="100";
		System.out.println(s1+100);
		
		//Converting Object to Primitive That is String Data to Int
		//Using Integer Wrapper class
		
		int num=Integer.parseInt(s1);
		System.out.println(num+100);
		
		String s2="22.39";
		System.out.println(s2+11.11 );
		
		// Convert String to Double
		double d=Double.parseDouble(s2);
		System.out.println(d+11.11);
		
		String s3="true";
		boolean b=Boolean.parseBoolean(s3);
		System.out.println(b);
		
		//String to character convertion
		
		String s4="K";
	 char c=s4.charAt(0);
	 System.out.println(c);
	 
	 String s5="ShreyaAditi";
	 char c1=s5.charAt(7);
	 System.out.println(c1);
	 
	 // Primitive to Object
	 //Object means converting Primitive data type into Strint type with the help of valuOf() method
	 
	 int x=200;
	 System.out.println(x+100);  //0/p is 300
	    String ss1= String.valueOf(x);
	    System.out.println(ss1+100);  // O/p is 200100
	    
	    float f=23.34f;
	    System.out.println(f+11.11f);
	    String ss2=String.valueOf(f);
	    System.out.println(ss2+11.11f);
	    
	    
	    
	    
	    
	    
		
	}
}
