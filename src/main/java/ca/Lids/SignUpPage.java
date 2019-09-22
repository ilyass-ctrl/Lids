package ca.Lids;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage {
	
	protected WebDriver driver = null;
	
	
	public SignUpPage (WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(css = "")
	protected WebElement clickToOpenBtn;
	
	@FindBy(css = "")
	protected WebElement firstName;
	
	@FindBy(css = "")
	protected WebElement lastName;
	
	@FindBy(css = "")
	protected WebElement email;
	
	@FindBy(css = "")
	protected WebElement password;
	
	@FindBy(css = "")
	protected WebElement createAccountBtn;
	
	
	public void toOpenClick() {
		clickToOpenBtn.click();
	}
	
	public void fillUserDetails(String f_Name, String l_tName, String e_mail, String pass) {
		firstName.sendKeys(f_Name);
		lastName.sendKeys(l_tName);
		email.sendKeys(e_mail);
		password.sendKeys(pass);
	}
	
	public void createAccountClick() {
		createAccountBtn.click();
	}
}
