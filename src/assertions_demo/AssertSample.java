package assertions_demo;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssertSample {
	
	WebDriver driver;
	@Before
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "D:\\Batch 54\\Selenium\\drivers\\chromedriver_win32 (5)\\chromedriver.exe");
		driver = new ChromeDriver();
		//page Load time out
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		//implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test
	public void tableDemo() {

		String expectedTitle = "Facebook – log in or sign";
		
		String actualTitle = driver.getTitle();
		
		WebElement forgottenPasswordLink = driver.findElement(By.linkText("Forgotten password?"));
		
		//Assert.assertTrue(forgottenPasswordLink.isDisplayed());
		
		Assert.assertEquals(expectedTitle, actualTitle);
		
		forgottenPasswordLink.click();
	}
	
	@After
	public void tearDown() {
		
		driver.quit();
	}

}
