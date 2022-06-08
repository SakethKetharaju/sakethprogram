package demo;

import org.testng.annotations.Test;

public class FacebookProfile {

	@Test (priority=1)
	public void checkProfileLink() {
		System.out.println("The link test is successful");
	}
	
	@Test (priority=0)
	public void checkProfileLogo() {
		System.out.println("The logo test is successful");
	}
}
