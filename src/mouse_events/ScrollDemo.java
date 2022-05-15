package mouse_events;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollDemo {


	WebDriver driver;
	@Before
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "D:\\Batch 54\\Selenium\\drivers\\chromedriver_win32 (5)\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		driver.get("https://jqueryui.com/droppable/");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}


	@Test
	public void mouseHoverDemo() throws InterruptedException, IOException {


		JavascriptExecutor jsx = (JavascriptExecutor)driver;
		jsx.executeScript("window.scrollBy(0, 200)");

		Thread.sleep(3000);

		jsx.executeScript("window.scrollBy(0, 300)");

		Thread.sleep(3000);

		jsx.executeScript("window.scrollBy(0, 400)");

		Thread.sleep(3000);

		jsx.executeScript("window.scrollBy(0, 500)");

		Thread.sleep(3000);

		jsx.executeScript("window.scrollBy(0, -400)");
		
		Thread.sleep(3000);

		jsx.executeScript("window.scrollBy(0, -300)");
	}

	@After
	public void tearDown() {

		driver.quit();
	}


}
