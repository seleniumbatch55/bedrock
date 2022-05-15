package handling_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MultiDropdown2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Batch 54\\Selenium\\drivers\\chromedriver_win32 (5)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		
		JavascriptExecutor jsx = (JavascriptExecutor)driver;
		
		jsx.executeScript("window.scrollBy(0,1200)", "");
		
		//driver.findElement(By.xpath("//div[contains(@class,'ui fluid dropdown sele')]")).click();
		
		WebElement skillsDropdown = driver.findElement(By.xpath("//div[contains(@class,'ui fluid')]/select[@name='skills']"));
		
		Actions action = new Actions(driver);
		action.moveToElement(skillsDropdown).perform();
		
		Select dropDown = new Select(skillsDropdown);
		
		dropDown.selectByVisibleText("Angular");
		dropDown.selectByVisibleText("Javascript");
		dropDown.selectByVisibleText("Python");
		
		List<WebElement> allSelectedOptions = dropDown.getAllSelectedOptions();
		
		
		
		for(WebElement selectedOptions:allSelectedOptions) {
			System.out.println(selectedOptions.getText());
		}
	
		
		//driver.findElement(By.xpath("//option[text()='Angular']")).click();
		//driver.findElement(By.xpath("//div[1]/select[@name='skills']/option[text()='Javascript']")).click();
		
		
	}

}
