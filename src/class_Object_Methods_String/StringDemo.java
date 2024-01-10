package class_Object_Methods_String;

public class StringDemo {

	public static void main(String[] args)
	{
		String s1="hello";
		String s2=new String("hello"); 
		System.out.println(s1==s2); // false
		String s3="hello";
		System.out.println(s1==s3); //True
		
		//String is immutable
		s1=s1+"all";
		System.out.println(s1==s3); //false
		
		System.out.println("******Different String methods**********");
		//length method
		String ss1="Hello Everyone";
		System.out.println("Length of the String "+ ss1.length());
		
		//to get character from string charAt(index)
		System.out.println("character ar 8th indext " + ss1.charAt(8)); //e
		
		//to check equality between string 
		//i.equalsIgnoreCase();
		//2.equals();
		 String act="Selenium WebDriver is Web UI API";
		 String exp="Selenium WebDriver is Web UI API";
		 System.out.println(act.equalsIgnoreCase(exp));
		 
		 //toUpperCase(); , toLowerCase();
		 System.out.println("to convert in Upper case " + ss1.toUpperCase());
		 System.out.println("To convert in lower case " + ss1.toLowerCase());
		 
		 // Partial String match contains();
		 System.out.println("test for API " + act.contains("API"));// true
		 System.out.println("test for API " + act.contains("api"));
		 
		 //trim(); is used to remove white space befor and after the string
		 String ss2= "     Welcome all       ";
		 System.out.println(ss2);
		 System.out.println(ss2.trim());
		 
		 //startsWith(prefix) and endsWith(suffix)
		 String ss3="Appium is mobile Application testing tool";
		 System.out.println("test string starts with App " + ss3.startsWith("App"));
		 
		 //Split(regular Expression)
		 String tools="Selenium,jmeter,Appium,Postman,API";
		 System.out.println(tools);
		 String arr[]= tools.split(",");
		 for (int i=0; i<5; i++)
		 {
			 System.out.println(arr[i]);
		 }
		 
		
		
		
		
		
	}

}
