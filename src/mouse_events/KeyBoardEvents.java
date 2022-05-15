package mouse_events;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardEvents {

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
	public void mouseHoverDemo() throws InterruptedException, IOException {

			driver.get("https://www.facebook.com/");
		
			
			WebElement email = driver.findElement(By.id("email"));
		
			Actions action = new Actions(driver);
			
			email.clear();
			email.sendKeys("selenium");
			
			Thread.sleep(5000);
			
			email.clear();
			
			action.keyDown(Keys.LEFT_SHIFT).sendKeys(email, "selenium").keyUp(Keys.LEFT_SHIFT).build().perform();
			
			Thread.sleep(10000);
	}

	@After
	public void tearDown() {

		driver.quit();
	}

}
