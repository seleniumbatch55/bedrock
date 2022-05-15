package parallel_execution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

class CreateAccountTest extends Base2{
	
	@Test
	public void createAccount() {
		
		WebElement createNewAccountButton = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		createNewAccountButton.click();
		
		WebElement signUpLabel = driver.findElement(By.xpath("//div[text()='Sign Up']"));
		
		if(signUpLabel.isDisplayed()) {
			
			String text = signUpLabel.getText();
			System.out.println(text);
		}
	}

}
