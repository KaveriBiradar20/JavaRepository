package oop.Encapsulation;

public class LoginPage 
{
	private String userName;
	private String password;
	
	//Public method
	public String getUserName() 
	{
		return userName;
	}
	public void setUserName(String userName) 
	{
		this.userName = userName;
	}
	public String getPassword() 
	{
		return password;
	}
	public void setPassword(String password) 
	{
		this.password = password;
	}

	//Business Logic
	public void doLogin(String un, String psw)
	{
		System.out.println("User login with name " + un );
	}
	
		
}
