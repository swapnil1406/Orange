package stepDefinition;

import java.time.Duration;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import pageFactory.AdminPage;
import pageFactory.HomePage;
import pageFactory.LoginPage;
import pageFactory.PimPage;
import pageFactory.LeavePage;
import pageManager.PageObjectManager;

@RunWith(Cucumber.class)
public class UserSearch {
	
	public static Logger log = LogManager.getLogger(com.fasterxml.jackson.databind.deser.Deserializers.Base.class.getName());
	WebDriver driver;
	String baseURL;
	PageObjectManager pom;
	LoginPage lgnp;
	LeavePage lp;
	HomePage hp;
	AdminPage ap;
	PimPage pp;
	
	@Before
	public void browser_open() throws Throwable {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		driver = new ChromeDriver(options);
		baseURL = "https://opensource-demo.orangehrmlive.com";
		driver.get(baseURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		PageObjectManager pom = new PageObjectManager(driver);
		
		lgnp = pom.getLoginPage();
		hp = pom.getHomePage();
		ap = pom.getAdminPage();
		pp = pom.getPimPage();
		lp = pom.getLeavePage();
		
	}

    @Given("^User login with username as \"([^\"]*)\" password as \"([^\"]*)\"$")
    public void user_login_with_username_as_something_password_as_something(String userid, String userpassword) throws Throwable {
		
		lgnp.enterUserName(userid);
		log.info(userid + " add OK");

		lgnp.enterUserPassword(userpassword);
		log.info(userpassword + " add OK");

		lgnp.loginButtonClick();
		log.info("Login click OK");
	}

	@When("^User navigate to admin link$")
	public void user_navigate_to_admin_link() throws Throwable {

		Actions a = new Actions(driver);
		a.moveToElement(hp.adminLnk()).click().build().perform();
		log.info("Admin navigate OK");
	}

	@And("^Click search$")
	public void click_search() throws Throwable {

		ap.searchBtnClick();
		log.info("Search click OK");
	}
	

    @And("^User add user to search as \"([^\"]*)\"$")
    public void user_add_user_to_search_as_something(String usersearch) throws Throwable {

		ap.enterEmplUserName(usersearch);
		log.info(usersearch + " add in search box OK");

	}

    @Then("^Search results with \"([^\"]*)\" or error display$")
    public void search_results_with_something_or_error_display(String usersearch) throws Throwable {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");

		List<WebElement> num_rows = driver.findElements(By.xpath("//*[@id='resultTable']/tbody/tr"));

		for (int i=0;i<num_rows.size();i++) {
			String userDetails = num_rows.get(i).getText();
			if(userDetails.contains(usersearch)) {
				log.info(usersearch + " present");
				break;
			}
			else {
				log.info("NO RECORD FOUND !!!");
			}
		}
	}
    
    @Then("^Clicks employee list link to display employee$")
    public void clicks_employee_list_link_to_display_employee() throws Throwable {
    	pp.emplLstLnkClick();
    	log.info("Employee list link click OK");
    }
    
    @Then("^Clicks report to get employee report$")
    public void clicks_report_to_get_employee_report() throws Throwable {
    	
    	pp.reportlLnkClick();
    	log.info("Report link click OK");
    }

    @Then("^Clicks add employee to add employee$")
    public void clicks_add_employee_to_add_employee() throws Throwable {
    	pp.addEmplLnkClick();
    	log.info("Add employee link click OK");
    }
    
    @When("^User navigate to leave link$")
    public void user_navigate_to_leave_link() throws Throwable {
    	Actions a = new Actions(driver);
    	a.moveToElement(hp.lnk_leave()).click().build().perform();
		log.info("Admin navigate OK");
    	
    }
    
    @Then("^Click apply leave$")
    public void click_apply_leave() throws Throwable {
    	lp.lnk_applyLeave();
    	log.info("Apply leave click OK");
    }

    @Then("^Click my leaves$")
    public void click_my_leaves() throws Throwable {
    	lp.lnk_viewMyLeaveList();
    	log.info("My leaves view OK");
    }

    @Then("^Click entitlements$")
    public void click_entitlements() throws Throwable {
    	lp.lnk_leaveEntitlements();
    	log.info("Leave Entitlements OK");
    }

    @Then("^Click leave reports$")
    public void click_leave_reports() throws Throwable {
    	lp.lnk_leaveReports();
    	log.info("Leave Reports OK");
    }

    @Then("^Click configure$")
    public void click_configure() throws Throwable {
    	lp.lnk_leaveConfigure();
    	log.info("Leave Configure OK");
    }

    @Then("^Click leave list$")
    public void click_leave_list() throws Throwable {
    	lp.lnk_viewLeaveList();
    	log.info("View Leave list OK");
    }

    @Then("^Click Assign leave$")
    public void click_assign_leave() throws Throwable {
    	lp.lnk_assignLeave();
    	log.info("Assign OK");
    	
    }
    
    @When("^User navigate to pim link$")
    public void user_navigate_to_pim_link() throws Throwable {
    	
    	hp.pimlLnkClick();
    	log.info("Pim click OK");
    	
    }

	@After
	public void logout() throws Throwable {

		hp.welcomeLnkClick();
		hp.logoutLnkClick();

		log.info("Logout OK");

		driver.quit();
	}
}