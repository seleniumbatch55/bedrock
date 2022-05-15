package handling_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingRadioButtons {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Batch 54\\Selenium\\drivers\\chromedriver_win32 (5)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement createNewAccountButton = driver.findElement(By.linkText("Create New Account"));
		
		createNewAccountButton.click();
		
		Thread.sleep(2000);
		
		WebElement maleRadioButton = driver.findElement(By.xpath("//label[text()='Male']/following::input[@name='sex' and @value='2']"));
		
		System.out.println("maleRadioButton before clicking: "+ maleRadioButton.isSelected());
		
		maleRadioButton.click();
		
		System.out.println("maleRadioButton is after clicking: "+ maleRadioButton.isSelected());
	}

}
