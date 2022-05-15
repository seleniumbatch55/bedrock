package testng_annotations;

import org.testng.annotations.Test;

public class Dependency {
	
	@Test
	public void login() {
		
		System.out.println(2/0);
		System.out.println("login");
	}
	
	@Test(dependsOnMethods = "login")
	public void logout() {
		
		System.out.println("logout");
	}

}
