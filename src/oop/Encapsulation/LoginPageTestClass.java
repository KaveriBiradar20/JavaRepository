package oop.Encapsulation;

public class LoginPageTestClass {

	public static void main(String[] args) 
	{
		LoginPage user1=new LoginPage();
		user1.setUserName("kavya");
		user1.setPassword("k123");
		user1.doLogin(user1.getUserName(), user1.getPassword());
		
		LoginPage user2=new LoginPage();
		user2.setUserName("radha");
		user2.setPassword("r123");
		user2.doLogin(user2.getUserName(), user2.getPassword());
		

	}

}
