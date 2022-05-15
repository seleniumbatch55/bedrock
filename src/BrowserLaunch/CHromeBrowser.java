package BrowserLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CHromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Batch 54\\Selenium\\drivers\\chromedriver_win32 (5)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement emailAddressField = driver.findElement(By.id("email"));
		emailAddressField.clear();
		emailAddressField.sendKeys("seleniumbatch54@gmail.com");
		String enteredText = emailAddressField.getAttribute("class");
		//System.out.println("Email entered into the field is: "+enteredText);
		
		WebElement passwordField = driver.findElement(By.name("pass"));
		passwordField.clear();
		passwordField.sendKeys("123456");
		String enteredPassword = passwordField.getAttribute("type");
		//System.out.println("Password into the field is: "+enteredPassword);
		
		WebElement loginButton = driver.findElement(By.xpath("//button[@data-testid='royal_login_button']"));
		loginButton.submit();
		
		Thread.sleep(6000);
		
		driver.close();
	}

}
