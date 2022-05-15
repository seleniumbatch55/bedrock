package testng_annotations;

import org.testng.annotations.Test;

public class InvocationCount {
	
	@Test
	public void a1() {
		System.out.println("a1 method");
	}
	
	@Test(invocationCount = 5)
	public void b1() {
		
		System.out.println("b1 method");
	}
	
	@Test
	public void c1() {
		System.out.println("c1 method");
	}

}
