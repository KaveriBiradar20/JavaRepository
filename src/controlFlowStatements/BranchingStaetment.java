package controlFlowStatements;

public class BranchingStaetment {

	public static void main(String[] args) 
	{

       for(int i=1; i<=10; i++)
       {
    	   if(i>=5)
    	   {
    		   break;
    	   }
    	   else
    	   System.out.println(i);
       }
       System.out.println("end");

	
	
	for(int j=1 ; j<=10; j++)
	{
		if(j>5)
		{
			continue;
		}
		else
			System.out.println(j);
	}
	}
	}


