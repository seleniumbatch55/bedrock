package testng_annotations;

import org.testng.annotations.Test;

public class ExceptionsDemo {
	
	@Test(expectedExceptions = {Exception.class})
	public void login() {
		
		
		System.out.println(2/0);
		System.out.println("login");
	}
	
	

}
