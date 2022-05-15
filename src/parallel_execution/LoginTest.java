package parallel_execution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest extends Base2{
	
	
	
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
}
