package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	
	@FindBy(id="txtUsername")
	WebElement txt_userName;
	
	@FindBy(id="txtPassword")
	WebElement txt_password;
	
	
	@FindBy(id="btnLogin")
	WebElement btn_login;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserName (String userid) {
		txt_userName.sendKeys(userid);
	}

	public void enterUserPassword (String userpassword) {
		txt_password.sendKeys(userpassword);
	}
	
	public void loginButtonClick () {
		btn_login.click();
	}

}
