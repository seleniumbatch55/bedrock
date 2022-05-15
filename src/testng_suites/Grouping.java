package testng_suites;

import org.testng.annotations.Test;

public class Grouping {
	
	@Test(groups =  "High")
	public void a1() {
		System.out.println("a1 method");
	}
	
	@Test(groups =  "Medium")
	public void b1() {
		System.out.println("b1 method");
	}
	
	@Test(groups =  "Low")
	public void c1() {
		System.out.println("c1 method");
	}
	
	@Test(groups =  {"High","Smoke","Regression"})
	public void d1() {
		System.out.println("d1 method");
	}
	
	@Test(groups =  "Low")
	public void e1() {
		System.out.println("e1 method");
	}
	
	@Test(groups =  "Medium")
	public void f1() {
		System.out.println("f1 method");
	}
	

}
