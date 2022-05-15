package handling_alerts;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingJSAlert {
	
	WebDriver driver;

	
	@Before
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Batch 54\\Selenium\\drivers\\chromedriver_win32 (5)\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	
	@Test
	public void testToVerifyAlert() throws InterruptedException {
		
		WebElement submitButton = driver.findElement(By.name("submit"));
		submitButton.click();
		
		Thread.sleep(3000);
		Alert al = driver.switchTo().alert();
		String text = al.getText();
		
		System.out.println("The Alert text is: "+text);
		
		//al.accept();
		
		al.dismiss();
		
	}
	
	@After
	public void tearDown() {
		
		driver.quit();
	}
	

}
