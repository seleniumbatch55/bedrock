package handling_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultiDropdown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Batch 54\\Selenium\\drivers\\chromedriver_win32 (5)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/select-menu");
		
		WebElement carsDropdown = driver.findElement(By.id("cars"));
		
		Select dropDown = new Select(carsDropdown);
		
		System.out.println("Cars Dropdown is Multi Dropdown element: "+dropDown.isMultiple());
		
		dropDown.selectByIndex(0);
		dropDown.selectByValue("opel");
		dropDown.selectByVisibleText("Audi");
		
		WebElement firstSelectedOption = dropDown.getFirstSelectedOption();
		
		System.out.println("First Selected Option is: "+firstSelectedOption.getText());
		
		System.out.println("**********************************************");
		
		System.out.println("All Sected Opotions are: ");
		List<WebElement> allSelectedOptions = dropDown.getAllSelectedOptions();
		
		for(WebElement selectedOptions:allSelectedOptions) {
			
			System.out.println(selectedOptions.getText());
		}
		
		dropDown.deselectByValue("opel");
		
		System.out.println("**********************************************");
		
		System.out.println("Updated Sected Opotions are: ");
		
		allSelectedOptions = dropDown.getAllSelectedOptions();
		
		for(int i=0;i<allSelectedOptions.size();i++) {
			
			System.out.println(allSelectedOptions.get(i).getText());
		}
		
	}

}
