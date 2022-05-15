package testng_suites;

import org.testng.annotations.Test;

public class Grouping2 {
	
	@Test(groups =  "High")
	public void l1() {
		System.out.println("l1 method");
	}
	
	@Test(groups =  "Medium")
	public void m1() {
		System.out.println("m1 method");
	}
	
	@Test(groups =  "Low")
	public void n1() {
		System.out.println("n1 method");
	}
	
	@Test(groups =  "High")
	public void x1() {
		System.out.println("x1 method");
	}
	
	@Test(groups =  "Low")
	public void z1() {
		System.out.println("z1 method");
	}
	
	@Test(groups =  "Medium")
	public void o1() {
		System.out.println("o1 method");
	}
	

}
