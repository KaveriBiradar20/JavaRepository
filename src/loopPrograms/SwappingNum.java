package loopPrograms;

public class SwappingNum {

	public static void main(String[] args) 
	{
		/*int a=10, b=20,temp=0;
		System.out.println("Befor eswapping a= 10 and b= 20 ");
		temp=a;
		a=b;
		b=temp;
		System.out.println("After Swapping a = " + a + " & " + " b = " + b );
		*/
		// Swapping of two numbers without extra variable
		
		int a=10, b=20;
		System.out.println("Befor eswapping a= 10 and b= 20 ");
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping a = " + a + " & " + " b = " + b );
		
	}

}
