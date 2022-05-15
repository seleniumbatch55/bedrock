package handling_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDropdown1 {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Batch 54\\Selenium\\drivers\\chromedriver_win32 (5)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/select-menu");
		
		WebElement selectOptionDropdown = driver.findElement(By.xpath("//div[text()='Select Option']"));
		selectOptionDropdown.click();
		
		WebElement option = driver.findElement(By.xpath("//div[text()='Group 1, option 1']"));
		option.click();
	}

}
