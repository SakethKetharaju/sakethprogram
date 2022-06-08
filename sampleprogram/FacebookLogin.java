package demo;

import org.testng.annotations.Test;

public class FacebookLogin {

	@Test (priority=0)
	public void loginWithValidCredentials() {
		System.out.println("Hi, I am successfully logged-in");
	}
	
	@Test (priority=1)
	public void loginWithInValidCredentials() {
		System.out.println("Hi, I am not able to log-in");
	}
}
