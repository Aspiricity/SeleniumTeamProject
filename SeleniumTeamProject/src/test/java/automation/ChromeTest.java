package automation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class ChromeTest {

	private static final Logger logger = LogManager.getLogger(ChromeTest.class);
	private WebDriver driver;
	
	@Test
	public void loadSiteTest() {
		driver.get("https://damp-garden-55551.herokuapp.com/");
		Reporter.log("Site loaded successfully.");
		logger.info("Website loaded.");
	}
	
	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}