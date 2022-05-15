package handling_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingLinks {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Batch 54\\Selenium\\drivers\\chromedriver_win32 (5)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
//		WebElement forgottenPasswordLink = driver.findElement(By.linkText("Forgotten password?"));
//		forgottenPasswordLink.click();
		
		WebElement forgottenPasswordLink = driver.findElement(By.partialLinkText("Forgotten"));
		forgottenPasswordLink.click();
		
		

	}

}
