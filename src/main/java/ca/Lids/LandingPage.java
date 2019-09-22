package ca.Lids;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage {
	
	protected WebDriver driver = null;
	
	
	public LandingPage (WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(css = "")
	protected WebElement myAccountBtn;
	
	public void goToSignUpPage() {
		myAccountBtn.click();
	}
}
