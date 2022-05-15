package testng_annotations;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FBLogin {
	
	WebDriver driver;
	@BeforeClass
	public void beforeClass() {
		
		System.out.println("Before Class Annotation");
	}
	
	@BeforeMethod
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Batch 54\\Selenium\\drivers\\chromedriver_win32 (5)\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	
	@Test
	public void forgottenAccountLink() {
		
		WebElement forgottenPasswordLink = driver.findElement(By.linkText("Forgotten password?"));
		forgottenPasswordLink.click();
		
		String title = driver.getTitle();
		
		System.out.println("Title of the page is: "+title);
		
	}
	
	@Test
	public void fbLogin() {
		WebElement emailAddressField = driver.findElement(By.id("email"));
		emailAddressField.clear();
		emailAddressField.sendKeys("seleniumbatch54@gmail.com");

		
		WebElement passwordField = driver.findElement(By.name("pass"));
		passwordField.clear();
		passwordField.sendKeys("123456");
		
		
		WebElement loginButton = driver.findElement(By.xpath("//button[@data-testid='royal_login_button']"));
		loginButton.submit();
		
		String title = driver.getTitle();
		
		System.out.println("Title of the page is: "+title);
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After Class Annotation");
	}

}
