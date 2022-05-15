package junit_demo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AnnotationDemo2 {
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class Annotation");
	}
	
	@Before
	public void before() {
		System.out.println("Before Annotation");
	}
	
	@Test
	public void testC1() {
		System.out.println("C1 test case");
	}
	
	
	@Test
	public void testA1() {
		System.out.println("a1 test case");
	}
	
	@Test
	public void testB1() {
		System.out.println("B1 test case");
	}
		
	@After
	public void after() {
		System.out.println("After Annotation");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class Annotation");
	}

}
