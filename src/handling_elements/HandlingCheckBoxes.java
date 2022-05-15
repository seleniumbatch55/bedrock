package handling_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckBoxes {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "D:\\Batch 54\\Selenium\\drivers\\chromedriver_win32 (5)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		
		WebElement checkbox1 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));
		boolean status = checkbox1.isSelected();
		System.out.println("Status of checkbox1 is: "+status);
		Thread.sleep(3000);
		checkbox1.click();
		WebElement checkbox2 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]"));
		status = checkbox2.isSelected();
		System.out.println("Status of checkbox2 is: "+status);

		checkbox2.click();
		
		
		
		

	}

}
