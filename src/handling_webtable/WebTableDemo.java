package handling_webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class WebTableDemo {

	WebDriver driver;
	@Before
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "D:\\Batch 54\\Selenium\\drivers\\chromedriver_win32 (5)\\chromedriver.exe");
		driver = new ChromeDriver();
		//page Load time out
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.aptransport.org/");
		driver.manage().window().maximize();

		//implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test
	public void tableDemo() {

		
		WebElement userCharges = driver.findElement(By.xpath("//span[text()='User Charges']"));
		
		userCharges.click();


		List<WebElement> allRows = driver.findElements(By.xpath("//h1[text()='USER CHARGES']/following::table/tbody/tr"));
		System.out.println("Total no.of Rows : "+allRows.size());

		for(int i=0; i<allRows.size(); i++) {
			
			List<WebElement> allColumns_EachRow = allRows.get(i).findElements(By.tagName("td"));
			
			for(int j=0; j<allColumns_EachRow.size();j++) {
				
				String columnData = allColumns_EachRow.get(j).getText();
				
				System.out.print(columnData+ " ");
				
			}
			
			System.out.println();
			
		}
		
		
		/*
		for(WebElement eachRow:allRows) {
			
			List<WebElement> allColumnsOfEachRow = eachRow.findElements(By.tagName("td"));
			
			for(WebElement tableColumn:allColumnsOfEachRow ) {
				
				System.out.print(tableColumn.getText());
				System.out.print("  ");
			}System.out.println();
		}*/
		
		/*
		String expectedTitle = "USER CHARGES | TRANSPORT DEPARTMENT GOVERNMENT OF ANDHRA PRADESH - IND";
		
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(expectedTitle, actualTitle);
		*/
		/*
		 * if(expectedTitle.equals(actualTitle)) {
		 * System.out.println("navigated to correct page"); }else {
		 * System.out.println("Loaded incorrect page"); }
		 */
	}

	@After
	public void tearDown() {


		driver.quit();
	}

}
