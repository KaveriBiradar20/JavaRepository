package week1;

public class TypeCastingDemo {

	public static void main(String[] args) {
		
		//Implicit type casting
		int x=34;
		long l=x;
		System.out.println("int to long conversion " +l);
		
		int z= 7898;// 4 byte
		float f1=z;
		System.out.println("int to float "+ f1);
		
		//Explicit type casting
		//double-->float--->long--->int
		
		double d1=787878.5677;
		float f3=(float)d1;		
System.out.println("double to float conversion is "+ f3);
	int a= (int)d1;
	System.out.println("double to int is " + a);
	
	int b=97; // 4 byte
	char c5= (char) b; //2byte
	
	System.out.println("int to chat conversion is " + c5);
	
	}

}
