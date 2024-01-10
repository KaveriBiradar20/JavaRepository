package week1;

public class ThisKeywordForConstructor
{
	//to call constructor also we use this() constuctor
	public ThisKeywordForConstructor() 
	{
		this(122);
		System.out.println("This is defalut constructor");
	    
	}
	
	public ThisKeywordForConstructor(int number) 
	{
		//this();
		System.out.println("This is parametrized constructor");
	
	}

	public static void main(String[] args) 
	{
		
		ThisKeywordForConstructor t1=new ThisKeywordForConstructor(); //calling default constructor first
		
		ThisKeywordForConstructor t2=new ThisKeywordForConstructor(23);
	}

}
