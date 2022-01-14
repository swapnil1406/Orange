package pageManager;

import org.openqa.selenium.WebDriver;

import pageFactory.AdminPage;
import pageFactory.HomePage;
import pageFactory.LeavePage;
import pageFactory.LoginPage;
import pageFactory.PimPage;

public class PageObjectManager {

	private WebDriver driver;

	private AdminPage ap;
	private HomePage hp;
	private LeavePage lp;
	private LoginPage lgnp;
	private PimPage  pp;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public AdminPage getAdminPage(){
		return (ap == null) ? ap = new AdminPage(driver) : ap;
	}	

	public HomePage getHomePage() {
		return (hp == null) ? hp = new HomePage(driver) : hp;
	}

	public LeavePage getLeavePage() {
		return (lp == null) ? lp = new LeavePage(driver) : lp;
	}

	public LoginPage getLoginPage() {
		return (lgnp == null) ? lgnp = new LoginPage(driver) : lgnp;
	}
	
	public PimPage getPimPage() {
		return (pp == null) ? pp = new PimPage(driver) : pp;
	}
}
