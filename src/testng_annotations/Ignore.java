package testng_annotations;

import org.testng.annotations.Test;

public class Ignore {
	
	@Test
	public void a1() {
		System.out.println("a1 method");
	}
	
	
	@Test(enabled = false)
	public void b1() {
		System.out.println("b1 method");
	}
	
	@Test(invocationCount = 0)
	public void c1() {
		System.out.println("c1 method");
	}
	

}
