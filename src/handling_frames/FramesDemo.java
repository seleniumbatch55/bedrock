package handling_frames;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {

WebDriver driver;

	
	@Before
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Batch 54\\Selenium\\drivers\\chromedriver_win32 (5)\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		
		driver.get("https://docs.oracle.com/javase/8/docs/api/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@Test
	public void testToVerifyAlert() throws InterruptedException {

		//driver.switchTo().frame("packageListFrame");
		
		//driver.switchTo().frame(0);
		
		WebElement frame1 = driver.findElement(By.xpath("//frame[@title='All Packages']"));
		
		driver.switchTo().frame(frame1);
		
		WebElement javaAppletLink = driver.findElement(By.linkText("java.applet"));
		javaAppletLink.click();
		
		Thread.sleep(6000);
	}
	
	@After
	public void tearDown() {
		
		driver.quit();
	}
}
