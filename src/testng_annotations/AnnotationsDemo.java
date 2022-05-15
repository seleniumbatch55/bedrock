package testng_annotations;

import org.testng.annotations.BeforeSuite;

public class AnnotationsDemo {
	
	@BeforeSuite
	public void BeforeSuite() {
		
		System.out.println("BeforeSuite");
		
	}

}
