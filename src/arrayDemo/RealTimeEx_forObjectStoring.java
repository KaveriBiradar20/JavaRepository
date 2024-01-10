package arrayDemo;

public class RealTimeEx_forObjectStoring 
{

	public static void main(String[] args) 
	{
		//Literal way
		//Object is super class in java
		Object empdata[]= {"Sarang","Pune",'M',40,9866578765L,89.78};
		System.out.println("Length is: "+empdata.length);
		
		System.out.println(empdata[4]);
		
		System.out.println("**************");
		
		
		
		for(Object i:empdata)
		{
			System.out.println(i);
		}
	}

}
