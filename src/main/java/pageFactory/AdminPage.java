package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {
	
	public WebDriver driver;
	
	@FindBy(id="btnAdd")
	WebElement btn_addUser;
	
	@FindBy(id="btnDelete")
	WebElement btn_delUser;
	
	@FindBy(id="systemUser_employeeName_empName")
	WebElement txt_emplName;
	
	@FindBy(id="searchSystemUser_userName")
	WebElement txt_emplUserName;

	@FindBy(id="systemUser_password")
	WebElement txt_emplPassword;
	
	@FindBy(id="systemUser_confirmPassword")
	WebElement txt_emplConfirmedPassword;
	
	@FindBy(id="btnSave")
	WebElement btn_save;
	
	@FindBy(id="searchSystemUser_userName")
	WebElement txt_userName;
	
	@FindBy(id="searchBtn")
	WebElement btn_search;
	
	@FindBy(id="resetBtn")
	WebElement btn_reset;
	
	@FindBy(id="menu_admin_UserManagement")
	WebElement lnk_userManagement;

	@FindBy(id="menu_admin_viewSystemUsers")
	WebElement lnk_viewSystemUsers;

	@FindBy(id="menu_admin_Job")
	WebElement lnk_adminJob;

	@FindBy(id="menu_admin_viewJobTitleList")
	WebElement lnk_viewJobTitleList;

	@FindBy(id="menu_admin_viewPayGrades")
	WebElement lnk_viewPayGrades;

	@FindBy(id="menu_admin_employmentStatus")
	WebElement lnk_employmentStatus;

	@FindBy(id="menu_admin_jobCategory")
	WebElement lnk_jobCategory;

	@FindBy(id="menu_admin_workShift")
	WebElement lnk_workShift;

	@FindBy(id="menu_admin_Organization")
	WebElement lnk_org;

	@FindBy(id="menu_admin_viewOrganizationGeneralInformation")
	WebElement lnk_orgGI;

	@FindBy(id="menu_admin_viewLocations")
	WebElement lnk_viewLocations;

	@FindBy(id="menu_admin_viewCompanyStructure")
	WebElement lnk_viewCompanyStructure;

	@FindBy(id="menu_admin_Qualifications")
	WebElement lnk_quali;

	@FindBy(id="menu_admin_viewSkills")
	WebElement lnk_viewSkills;

	@FindBy(id="menu_admin_viewEducation")
	WebElement lnk_viewEducation;

	@FindBy(id="menu_admin_viewLicenses")
	WebElement lnk_viewLicenses;

	@FindBy(id="menu_admin_viewLanguages")
	WebElement lnk_viewLanguages;

	@FindBy(id="menu_admin_membership")
	WebElement lnk_membership;

	@FindBy(id="menu_admin_nationality")
	WebElement lnk_nationality;

	@FindBy(id="menu_admin_addTheme")
	WebElement lnk_addTheme;

	@FindBy(id="menu_admin_Configuration")
	WebElement lnk_configuration;

	@FindBy(id="menu_admin_listMailConfiguration")
	WebElement lnk_listMailConfig;

	@FindBy(id="menu_admin_viewEmailNotification")
	WebElement lnk_viewEmailNotificatio;

	@FindBy(id="menu_admin_localization")
	WebElement lnk_localization;

	@FindBy(id="menu_admin_languagePackage")
	WebElement lnk_languagePack;

	@FindBy(id="menu_admin_viewModules")
	WebElement lnk_viewModules;

	@FindBy(id="menu_admin_openIdProvider")
	WebElement lnk_openIdProvider;
	
	@FindBy(id="systemUser_userType")
	WebElement userRoleScroll;
	
	public AdminPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void btn_addUser() {
		btn_addUser.click();
	}
	
	public void btn_delUser() {
		btn_delUser.click();
	}
	
	public void txt_emplName(String emplName) {
		txt_emplName.sendKeys(emplName);
	}
	
	public void enterEmplUserName(String emplUserName) {
		txt_emplUserName.sendKeys(emplUserName);
	}
	
	public void txt_emplPassword(String emplPassword) {
		txt_emplPassword.sendKeys(emplPassword);
	}
	
	public void txt_emplConfirmedPassword(String emplConfirmedPassword) {
		txt_emplConfirmedPassword.sendKeys(emplConfirmedPassword);
	}
	
	public void btn_save() {
		btn_save.click();
	}
	
	public void txt_userName(String userName) {
		txt_userName.sendKeys(userName);
	}
	
	public void searchBtnClick() {
		btn_search.click();
	}
	
	public void btn_reset() {
		btn_reset.click();
	}
	
	public void  lnk_userManagement() {
	lnk_userManagement.click();
	}

	public void  lnk_viewSystemUsers() {
	lnk_viewSystemUsers.click();
	}
	
	public void  lnk_adminJob() {
	lnk_adminJob.click();
	}
	
	public void  lnk_viewJobTitleList() {
	lnk_viewJobTitleList.click();
	}
	
	public void  lnk_viewPayGrades() {
	lnk_viewPayGrades.click();
	}
	
	public void  lnk_employmentStatus() {
	lnk_employmentStatus.click();
	}
	
	public void  lnk_jobCategory() {
	lnk_jobCategory.click();
	}
	
	public void  lnk_workShift() {
	lnk_workShift.click();
	}
	
	public void  lnk_org() {
	lnk_org.click();
	}
	
	public void  lnk_orgGI() {
	lnk_orgGI.click();
	}
	
	public void  lnk_viewLocations() {
	lnk_viewLocations.click();
	}
	
	public void  lnk_quali() {
	lnk_quali.click();
	}
	
	public void  lnk_viewSkills() {
	lnk_viewSkills.click();
	}
	
	public void  lnk_viewEducation() {
	lnk_viewEducation.click();
	}
	
	public void  lnk_viewLicenses() {
	lnk_viewLicenses.click();
	}
	
	public void  lnk_viewLanguages() {
	lnk_viewLanguages.click();
	}
	
	public void  lnk_membership() {
	lnk_membership.click();
	}
	
	public void  lnk_nationality() {
	lnk_nationality.click();
	}
	
	public void  lnk_addTheme() {
	lnk_addTheme.click();
	}
	
	public void  lnk_configuration() {
	lnk_configuration.click();
	}
	
	public void  lnk_listMailConfig() {
	lnk_listMailConfig.click();
	}
	
	public void  lnk_viewEmailNotificatio() {
	lnk_viewEmailNotificatio.click();
	}
	
	public void  lnk_localization() {
	lnk_localization.click();
	}
	
	public void  lnk_languagePack() {
	lnk_languagePack.click();
	}
	
	public void  lnk_viewModules() {
	lnk_viewModules.click();
	}
	
	public void  lnk_openIdProvider() {
	lnk_openIdProvider.click();
	}
	
	public WebElement userRoleScroll() {
	return userRoleScroll;
	}
}
