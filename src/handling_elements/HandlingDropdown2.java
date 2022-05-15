package handling_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown2 {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Batch 54\\Selenium\\drivers\\chromedriver_win32 (5)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(2000);
		WebElement yearDropdown = driver.findElement(By.cssSelector("#year"));
		
		Select dropDown = new Select(yearDropdown);
		
		//dropDown.selectByIndex(12);
		
		//dropDown.selectByValue("2010");
		
		dropDown.selectByVisibleText("2010");
		
		WebElement selectedOption = dropDown.getFirstSelectedOption();
		System.out.println("selected Option is: "+selectedOption.getText());
		
		//selectedOption.getText();
		
		List<WebElement> allOptions = dropDown.getOptions();
		
		System.out.println("All Options in the year dropdown");
		System.out.println("*********************************");
		
		/*
		for(int i=0;i<allOptions.size();i++) {
			System.out.println(allOptions.get(i).getText());
		}*/
		
		for(WebElement totalOptions:allOptions) {
			System.out.println(totalOptions.getText());
		}
		
		
		
	}

}
