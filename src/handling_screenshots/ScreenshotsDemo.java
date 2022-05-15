package handling_screenshots;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotsDemo {


	WebDriver driver;


	@Before
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "D:\\Batch 54\\Selenium\\drivers\\chromedriver_win32 (5)\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		driver.get("https://www.facebook.com/");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}


	@Test
	public void demo() throws InterruptedException, IOException {
		try {

			driver.findElement(By.linkText("Forgotten pass")).click();

		}

		catch(Exception e) {
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd_MM_yyyy HH_mm_ss");

			Date date = new Date();

			String currentDate_Time = dateFormat.format(date);

			System.out.println(currentDate_Time);



			File ss = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

			File destination = new File("D:\\Screenshots\\"+currentDate_Time+".png");

			FileUtils.copyFile(ss, destination);

			Thread.sleep(3000);
		}
	}


	@After
	public void tearDown() {

		driver.quit();
	}

}
