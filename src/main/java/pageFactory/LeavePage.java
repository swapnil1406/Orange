package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeavePage {
	
	public WebDriver driver;
	
	@FindBy(id="menu_leave_applyLeave")
	WebElement lnk_applyLeave;
	
	@FindBy(id="menu_leave_viewMyLeaveList")
	WebElement lnk_viewMyLeaveList;
	
	@FindBy(id="menu_leave_Entitlements")
	WebElement lnk_leaveEntitlements;
	
	@FindBy(id="menu_leave_addLeaveEntitlement")
	WebElement lnk_addLeaveEntitlement;
	
	@FindBy(id="menu_leave_viewLeaveEntitlements")
	WebElement lnk_viewLeaveEntitlements;
	
	@FindBy(id="menu_leave_viewMyLeaveEntitlements")
	WebElement lnk_viewMyLeaveEntitlements;
	
	@FindBy(id="menu_leave_Reports")
	WebElement lnk_leaveReports;
	
	@FindBy(id="menu_leave_viewLeaveBalanceReport")
	WebElement lnk_vieweaveBalanceReport;
	
	@FindBy(id="menu_leave_viewMyLeaveBalanceReport")
	WebElement lnk_viewMyLeaveBalanceReport;
	
	@FindBy(id="menu_leave_Configure")
	WebElement lnk_leaveConfigure;
	
	@FindBy(id="menu_leave_defineLeavePeriod")
	WebElement lnk_defineLeavePeriod;
	
	@FindBy(id="menu_leave_leaveTypeList")
	WebElement lnk_leaveTypeList;
	
	@FindBy(id="menu_leave_defineWorkWeek")
	WebElement lnk_defineWorkWeek;
	
	@FindBy(id="menu_leave_viewHolidayList")
	WebElement lnk_viewHolidayList;
	
	@FindBy(id="menu_leave_viewLeaveList")
	WebElement lnk_viewLeaveList;
	
	@FindBy(id="menu_leave_assignLeave")
	WebElement lnk_assignLeave;
	
	public LeavePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void lnk_applyLeave() {
	lnk_applyLeave.click();
	}
	
	public void lnk_viewMyLeaveList() {
	lnk_viewMyLeaveList.click();
	}
	
	public void lnk_leaveEntitlements() {
	lnk_leaveEntitlements.click();
	}
	
	public void lnk_addLeaveEntitlement() {
	lnk_addLeaveEntitlement.click();
	}
	
	public void lnk_viewLeaveEntitlements() {
	lnk_viewLeaveEntitlements.click();
	}
	
	public void lnk_viewMyLeaveEntitlements() {
	lnk_viewMyLeaveEntitlements.click();
	}
	
	public void lnk_leaveReports() {
	lnk_leaveReports.click();
	}
	
	public void lnk_vieweaveBalanceReport() {
	lnk_vieweaveBalanceReport.click();
	}
	
	public void lnk_viewMyLeaveBalanceReport() {
	lnk_viewMyLeaveBalanceReport.click();
	}
	
	public void lnk_leaveConfigure() {
	lnk_leaveConfigure.click();
	}
	
	public void lnk_defineLeavePeriod() {
	lnk_defineLeavePeriod.click();
	}
	
	public void lnk_leaveTypeList() {
	lnk_leaveTypeList.click();
	}
	
	public void lnk_defineWorkWeek() {
	lnk_defineWorkWeek.click();
	}
	
	public void lnk_viewHolidayList() {
	lnk_viewHolidayList.click();
	}
	
	public void lnk_viewLeaveList() {
	lnk_viewLeaveList.click();
	}
	
	public void lnk_assignLeave() {
	lnk_assignLeave.click();
	}
	
	
}
