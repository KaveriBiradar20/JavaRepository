package arrayDemo;

public class Array_1D_2ndProgram {

	public static void main(String[] args) 
	{
		String cMonth="Nov 2023";
		String data[]=cMonth.split(" ");
		System.out.println(data[0]);
		System.out.println(data[1]);
		
//		for(int i=0;i<=1;i++)
//		{
//			System.out.println(data[i]);
//		}
		
		for(String i:data)
		{
			System.out.println(i);
		}

	}

}
