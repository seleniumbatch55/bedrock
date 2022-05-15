package testng_annotations;

import org.testng.annotations.Test;

public class Priority {
	
	@Test(priority = 3)
	public void a1() {
		System.out.println("a1 method");
	}
	
	@Test(priority = 5)
	public void b1() {
		System.out.println("b1 method");
	}
	
	@Test
	public void c1() {
		System.out.println("c1 method");
	}
	
	@Test
	public void d1() {
		System.out.println("d1 method");
	}
	
	@Test(priority = 4)
	public void e1() {
		System.out.println("e1 method");
	}

}
