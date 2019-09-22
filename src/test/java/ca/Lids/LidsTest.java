package ca.Lids;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

import ca.Lids.LandingPage;

public class LidsTest {
	WebDriver driver;
	LandingPage landingPage;
  
  @BeforeTest
  public void setUp() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saighi Ilyass\\Downloads\\WebDrivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("disable-infobars");
		options.addArguments("start-maximized");

		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.lids.ca");
		landingPage = PageFactory.initElements(driver, LandingPage.class);
  }

  @AfterTest
  public void tearDown() {
	  driver.close();
  }
  
  @Test(priority = 1)
  public void landingTest() {
	  
  }
  
  @Test(priority = 2)
  public void signUpTest() {
	  
  }
  
}
