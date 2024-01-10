package controlFlowStatements;

public class ReturnKeyword 
{
	
// Method without return
	public void add()
	{
		int a=100,b=100;
		System.out.println("Additon is " + (a+b));
	}
	
	//Method with return keyword
	 public int sub()
	 {
		 int a=100, b=50;
		 return a-b; //return result to calling method
		 
	 }
	 
	 public String msg() 
	 {
		String m="hello";
				return m;
	 }
	

	public static void main(String[] args) 
	{
		ReturnKeyword obj=new ReturnKeyword();
		obj.add();
		
		int result = obj.sub(); //this is the calling method for return 
		System.out.println("substraction is " + result);
		
		System.out.println("Message is " + obj.msg());
		

	}

}
