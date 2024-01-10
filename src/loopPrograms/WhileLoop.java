package loopPrograms;

public class WhileLoop {

	public static void main(String[] args) 
	{
	 int i=1;
	 while(i<=5)
	 {
		 System.out.println("Hello");
		 i++;
	 }
	 
	 //Sum of digits num=123
	 int num=123,r,sum=0;
	 while(num>0)
	 {
		 r=num%10;
		 num=num/10;
		 sum=sum+r;
		 
	 }
	 System.out.println("Sum of Digits " + sum);
	 

	}

}
