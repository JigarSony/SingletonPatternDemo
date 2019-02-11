package pack1;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PageTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		DriverInit instancedriver = DriverInit.getInstance();
		driver = instancedriver.openBrowser();
	}
	
	@Test
	public void testMethod1() {
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
