package interfaceDemo;

public class NobelHS implements IMA, USMA
{
	public void medaclService()
	{
		System.out.println("NobelHS''''''Medical Service");
		
	}

	@Override
	public void cardio() 
	{
		System.out.println("NobelHS....cardioService");
		
	}

	@Override
	public void dental() 
	{
		System.out.println("NobelHS ..dentalService");
		
	}

	@Override
	public void neuro() 
	{
		System.out.println(" neuroserive by USMA");
		
	}

	@Override
	public void physio() 
	{
		
		System.out.println("physio service by USMA");
	}

	@Override
	public void covid19T() 
	{
		System.out.println(" covid 19 test");
	}
	

}
