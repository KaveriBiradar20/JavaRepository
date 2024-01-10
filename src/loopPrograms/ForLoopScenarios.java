package loopPrograms;

public class ForLoopScenarios {

	public static void main(String[] args)
	{
		//Print even Numbers till 20
		
		for(int i=1; i<=20; i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
		System.out.println("*****************");
		
		
		// 2's table
		for(int i=1;i<=10; i++)
		{
			System.out.println(2*i);
		}
		
		//Nested for loop
		
		for (int num=1; num<=10; num++)
		{
			for (int i=1 ; i<=10; i++)
			{
				System.out.print(num*i +"\t");
			}
			System.out.println();
			
		}
		
		
		

	}

}
