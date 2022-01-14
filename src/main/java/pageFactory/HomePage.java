package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public WebDriver driver;
	
	@FindBy(id="menu_admin_viewAdminModule")
	WebElement lnk_admin;
	
	@FindBy(id="menu_pim_viewPimModule")
	WebElement lnk_pim;
	
	@FindBy(id="menu_leave_viewLeaveModule")
	WebElement lnk_leave;
	
	@FindBy(id="menu_time_viewTimeModule")
	WebElement lnk_time;
	
	@FindBy(id="menu_recruitment_viewRecruitmentModule")
	WebElement lnk_recruitment;
	
	@FindBy(id="menu_pim_viewMyDetails")
	WebElement lnk_myInfo;
	
	@FindBy(id="menu__Performance")
	WebElement lnk_perfo;
	
	@FindBy(id="menu_dashboard_index")
	WebElement lnk_dashboard;
	
	@FindBy(id="menu_directory_viewDirectory")
	WebElement lnk_directory;
	
	@FindBy(id="menu_maintenance_purgeEmployee")
	WebElement lnk_maintenance;
	 
	@FindBy(id="menu_buzz_viewBuzz")
	WebElement lnk_buzz;
	
	@FindBy(id="welcome")
	WebElement lnk_welcome;
	
	@FindBy(linkText="Logout")
	WebElement lnk_logout;
	
	@FindBy(id="panel_wrapper_0")
	WebElement panel_dashboard;
	
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
		public WebElement adminLnk() {
		return lnk_admin;
	}
		public void pimlLnkClick() {
		lnk_pim.click();
	}
		public WebElement lnk_leave() {
		return lnk_leave;
	}
		public void lnk_time() {
		lnk_time.click();
	}
		public void lnk_recruitment() {
		lnk_recruitment.click();
	}
		public void lnk_myInfo() {
		lnk_myInfo.click();
	}
		public void lnk_perfo() {
		lnk_perfo.click();
	}
		public void lnk_dashboard() {
		lnk_dashboard.click();
	}
		public void lnk_directory() {
		lnk_directory.click();
	}
		public void lnk_maintenance() {
		lnk_maintenance.click();
	}
		public void lnk_buzz() {
		lnk_buzz.click();
	}
		public void welcomeLnkClick() {
		lnk_welcome.click();
	}		
		public void logoutLnkClick() {
		lnk_logout.click();
	}
		public void panel_dashboard() {
		panel_dashboard.isDisplayed();
	}

}