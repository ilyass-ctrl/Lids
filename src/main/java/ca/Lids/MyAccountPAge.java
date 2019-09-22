package ca.Lids;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPAge {
	
	protected WebDriver driver = null;
	
	
	public MyAccountPAge (WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(css = "")
	protected WebElement welcomeText;
	
	public String getWelcomeText() {
		return welcomeText.getText();
	}
}
