package handling_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingLabels2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Batch 54\\Selenium\\drivers\\chromedriver_win32 (5)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement facebookLabel = driver.findElement(By.xpath("//h2[contains(text(),'Facebook')]"));

		System.out.println("Facebook Label is displayed: "+facebookLabel.isDisplayed());
		
		String fontFamily = facebookLabel.getCssValue("font-family");
		
		String fontSize = facebookLabel.getCssValue("font-size");
		
		String width = facebookLabel.getCssValue("width");
		
		String color = facebookLabel.getCssValue("color");
		
		String bgColor = facebookLabel.getCssValue("background-color");
		
		System.out.println("Facebook Label fontFamily is : "+fontFamily);
		
		System.out.println("Facebook Label fontSize is : "+fontSize);
		
		System.out.println("Facebook Label width is : "+width);
		
		System.out.println("Facebook Label color is : "+color);
		
		System.out.println("Facebook Label bgColor is : "+bgColor);

	}

}
