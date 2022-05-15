package handling_windows;

import java.util.ArrayList;
import java.util.Set;
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

public class WindowsDemo {
	
	WebDriver driver;

	
	@Before
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Batch 54\\Selenium\\drivers\\chromedriver_win32 (5)\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	
	@Test
	public void demo() throws InterruptedException {
		
	
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		WebElement cookiePolicyLink = driver.findElement(By.linkText("Cookie Policy"));
		cookiePolicyLink.click();
		
		Set<String> allHandles = driver.getWindowHandles();
		
		ArrayList<String> handles = new ArrayList<String>(allHandles);
		
		String signUpPage = handles.get(0);
		
		String cookiePolicyPage = handles.get(1);
		
		driver.switchTo().window(cookiePolicyPage);
		
		System.out.println("Title of the webpage is:"+driver.getTitle());
		
		driver.findElement(By.xpath("//i[text()='Learn more about Meta']")).click();
		
		Thread.sleep(4000);
		
		driver.switchTo().window(signUpPage);
		
		System.out.println("Title of the webpage is:"+driver.getTitle());
		
		Thread.sleep(4000);
		
		driver.switchTo().window(cookiePolicyPage);
		
		Thread.sleep(3000);
		
		driver.close();
		
		Thread.sleep(3000);
	}
	
	@After
	public void tearDown() {
		
		driver.quit();
	}
	

}
