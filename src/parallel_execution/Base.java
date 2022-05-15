package parallel_execution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;



public class Base {

	WebDriver driver;

	@Parameters("browser")
	@BeforeMethod
	public void setUp(String browser) {

		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Batch 54\\Selenium\\drivers\\chromedriver_win32 (5)\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\Batch 54\\Selenium\\drivers\\geckodriver-v0.28.0-win64 (1)\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		driver.get("https://www.facebook.com/");

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void tearDown() {

		driver.quit();
	}

}
