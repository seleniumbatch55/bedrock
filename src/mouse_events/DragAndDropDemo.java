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

public class DragAndDropDemo {
	
	
		
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

			
			driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
			
			Thread.sleep(3000);
			WebElement sourceElement = driver.findElement(By.xpath("//p[contains(text(),'Drag')]"));
			
			WebElement destinationElement = driver.findElement(By.xpath("//p[text()='Drop here']"));
			
			Actions action = new Actions(driver);
			
			//action.dragAndDrop(sourceElement, destinationElement).perform();
			
			//action.clickAndHold(sourceElement).moveToElement(destinationElement).release().build().perform();
			
			action.dragAndDropBy(sourceElement, 100, 100).build().perform();
			Thread.sleep(5000) ;

		}
		
		@After
		public void tearDown() {
			
			driver.quit();
		}



}
