package handling_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingImages {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Batch 54\\Selenium\\drivers\\chromedriver_win32 (5)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement facebookImage = driver.findElement(By.xpath("//img[@alt='Facebook']"));	
		
		System.out.println("Facebook Image is displayed: "+ facebookImage.isDisplayed());
		
		System.out.println("Height of facebook image is: "+facebookImage.getSize().getHeight());
		
		System.out.println("Width of facebook image is: "+facebookImage.getSize().getWidth());

	}

}
