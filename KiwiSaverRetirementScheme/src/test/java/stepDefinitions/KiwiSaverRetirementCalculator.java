package stepDefinitions;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import pageObjects.HomePage;
import pageObjects.NavigateToRetirementCalculator;
import pageObjects.RetirementCalculatorForm;

public class KiwiSaverRetirementCalculator {
	
	WebDriver driver;
	
	@Before
	public void testSetup() throws InterruptedException {
		System.getProperty("webdriver.chrome.driver","/KiwiSaverRetirementScheme/src/test/java/requiredTools/chromedriver/chromedriver.exe");
		driver= new ChromeDriver();
		//System.getProperty("webdriver.chrome.driver","/KiwiSaverRetirementScheme/src/test/java/requiredTools/geckodriver/geckodriver.exe");
		//driver= new FirefoxDriver();
		//System.getProperty("webdriver.chrome.driver","/KiwiSaverRetirementScheme/src/test/java/requiredTools/IEDriverServer/IEDriverServer.exe");
		//driver= new InternetExplorerDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        HomePage home = new HomePage(driver);
        home.openHomePage();
	}

	@After
	public void testTeardown() {
		this.driver.manage().deleteAllCookies();
		this.driver.quit();
		this.driver=null;
	}
	
	@Given("^I Open navigate to the Retirement Calculator Form$")
	public void navigate_to_the_website() throws Throwable {
		NavigateToRetirementCalculator openCal = new NavigateToRetirementCalculator(driver);
		openCal.openRetirementForm();
	  
	    }

	@Given("^I Wait for Form to be loaded$")
	public void Wait_For_Page_To_Load() throws Throwable {
		NavigateToRetirementCalculator openCalwait = new NavigateToRetirementCalculator(driver);
		openCalwait.waitPageiSVisible();
	    }
	
	@Given("^I fill the retirement FormDetails$")
	public void fill_retirement_form(DataTable dt) throws Throwable {
		RetirementCalculatorForm enterData = new RetirementCalculatorForm(driver);
		List<Map<String, String>> list = dt.asMaps(String.class, String.class);
		for(int i=0; i<list.size(); i++) {
			enterData.fillKiwisaveCalculator(list.get(i).get("currentAge"), list.get(i).get("employmentStatus"), list.get(i).get("salaryWage"), list.get(i).get("kiwiSaverContribution"), list.get(i).get("currentKiwiSaverBalance"), list.get(i).get("voluntaryContribution"),list.get(i).get("voluntaryContributionFre"),list.get(i).get("riskProfile"),list.get(i).get("savingGoal"));
		 } 
		}
	
	@And("^I validate the helptext for all the fields$")
	public void validate_helptext(DataTable dt) throws InterruptedException{
		RetirementCalculatorForm enterData = new RetirementCalculatorForm(driver);
		enterData.selectIframe();
		List<Map<String, String>> list = dt.asMaps(String.class, String.class);
		for(int i=0; i<list.size(); i++) {
			enterData.validateHelpText(list.get(i).get("Label"), list.get(i).get("HelpText"),i);
		 } 
	}
		
		

}
