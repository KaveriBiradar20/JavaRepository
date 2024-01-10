package week1;

public class OperatorDemo 
{

	public static void main(String[] args) 
	{
		//Arithmetic Operator add,sub,multiplication,division
		int a=20, b=10;
		System.out.println("Addition is "+ (a+b));
		System.out.println("Division is " + (a/b));
		System.out.println("Modulus is " + (a%b));
		/*	
		Increament and Decreament
		 Pre Increament ++a-->
		 Post Increament a++ -->value will update in next iteration
		we will not c result immediately.
		
		*/
		System.out.println("a = "+ a);
		System.out.println(a++);
		System.out.println(a);
		System.out.println(b);
		System.out.println(++b);
		int c=90;
		int d=c++;
		System.out.println(d);
		System.out.println(c);
		int x=46;
		int y=++  x;
		System.out.println("X is "+x);
		System.out.println("Y is "+y);
		
		System.out.println("************Relational Operators************");
		
		int u=198,v=198,p=870, q=870, i=48, r=137, s=138 ;
	     System.out.println(i<s);// less than operator
	     System.out.println(q>v);
	     System.out.println(p>=q);
	     
	     System.out.println("equal to/Comparision operatot ==:"+ (s==r));
	      
	     System.out.println("not equal to operator :"+(p!=s));
	     
	      System.out.println("Logical operators");
            
	      System.out.println((u==v) && (p==q));
	      System.out.println(u!=v && p<r);
	      System.out.println((p<=s) || (u==v));
	      System.out.println( !(p==q));
	      
	      int t=90;
	      System.out.println(t>90);//false
	      System.out.println(!(t>90));//true
	      System.out.println(true);
	      System.out.println(!true);
	      
	}

}
