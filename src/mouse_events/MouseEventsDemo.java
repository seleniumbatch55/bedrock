package mouse_events;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEventsDemo {
	
	WebDriver driver;


	@Before
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "D:\\Batch 54\\Selenium\\drivers\\chromedriver_win32 (5)\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		driver.get("https://www.facebook.com/");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}


	@Test
	public void demo() throws InterruptedException, IOException {

		WebElement forgottenPasswordLink = driver.findElement(By.linkText("Forgotten password?"));
		
		Actions action = new Actions(driver);
		
		//action.click().perform();
		
		Thread.sleep(3000);
	
		//action.click(forgottenPasswordLink).perform();
		
		//action.contextClick().perform();
	
		//action.contextClick(forgottenPasswordLink).perform();
		
		//action.doubleClick().click();
		
		//action.doubleClick(forgottenPasswordLink).perform();
		
		//action.moveByOffset(200, 600).contextClick().build().perform();
		
		Thread.sleep(5000);

	}
	
	@After
	public void tearDown() {
		
		driver.quit();
	}



}
