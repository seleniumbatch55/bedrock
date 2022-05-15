package handling_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingLabels {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Batch 54\\Selenium\\drivers\\chromedriver_win32 (5)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement faceBookLabel = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps')]"));
		
		System.out.println("FaceBook Label is displayed: "+faceBookLabel.isDisplayed());
		
		String backgroundColor = faceBookLabel.getCssValue("background");
		String fontFamily = faceBookLabel.getCssValue("font-family");
		String fontSize = faceBookLabel.getCssValue("font-size");
		String color = faceBookLabel.getCssValue("color");
		
		System.out.println("backgroundColor of facebook Label is: "+backgroundColor);
		System.out.println("fontFamily of facebook Label is: "+fontFamily);
		System.out.println("fontSize of facebook Label is: "+fontSize);
		System.out.println("color of facebook Label is: "+color);
	}

}
