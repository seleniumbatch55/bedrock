package assertions_demo;

import org.junit.Assert;
import org.junit.Test;

public class AssertDemo {
	
	@Test
	public void demo() {
		
		int x = 10;
		
		int y = 20;
		
		//Assert.assertTrue(x<y);
		
		Assert.assertFalse(y<x);
		
		System.out.println("Hi");
		
		System.out.println("Bye");
	}

}
