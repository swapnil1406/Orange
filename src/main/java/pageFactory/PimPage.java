package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PimPage {
	
	public WebDriver driver;
	
	@FindBy(id="menu_pim_Configuration")
	WebElement lnk_PimConfig;
	
	@FindBy(id="menu_pim_viewEmployeeList")
	WebElement lnk_EmplList;
	
	@FindBy(id="menu_pim_addEmployee")
	WebElement lnk_AddEmpl;
	
	@FindBy(id="menu_core_viewDefinedPredefinedReports")
	WebElement lnk_report;
	
	public PimPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void pimConfigLnkClick () {
		lnk_PimConfig.click();
	}

	public void emplLstLnkClick () {
		lnk_EmplList.click();
	}
	
	public void addEmplLnkClick () {
		lnk_AddEmpl.click();
	}
	
	public void reportlLnkClick () {
		lnk_report.click();
	}

}
