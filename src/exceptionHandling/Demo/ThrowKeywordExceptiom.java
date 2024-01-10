package exceptionHandling.Demo;

public class ThrowKeywordExceptiom 
{

	public static void main(String[] args) throws StringIsNullException 
	{
		String s1=null;
		if (s1==null)
		{
			throw new StringIsNullException("String Object is null");
		}
	}

}
