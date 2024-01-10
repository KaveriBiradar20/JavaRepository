package arrayDemo;

public class Array_2D_RealTimeEx {

	public static void main(String[] args) 
	{
		Object obj[][]= {{"Admin","Admin123"},{"kavya","kavya123"},{"shreya","shreya123"},{"milind","milind123"},{"Aditi","Aditi@123"}};
		System.out.println("total rows are " + obj.length);
		System.out.println("total columns are " + obj[0].length);
		//Iterating the values of Array by for-each loop
		for(Object i[]: obj)
		{
			for(Object j:i)
			{
				System.out.print(j +"\t");
			}
			System.out.println();
			
		}
		System.out.println("*******************");
		
		//using for loop
		
		for (int i=0; i<obj.length; i++ )
		{
			for(int j=0; j<obj[0].length; j++)
			{
				System.out.print(obj[i][j] +"\t");
			}
			System.out.println();
		}
			
		

	}

}
