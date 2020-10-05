package pageObjects;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class RetirementCalculatorForm {

	WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	
	public RetirementCalculatorForm(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Xpaths for labels and fields
	@FindBy(how = How.XPATH, using="//iframe")
	static WebElement SelectIFrame;
	@FindBy(xpath ="//div[@model='ctrl.data.CurrentAge']//input[1]")
	WebElement currentAgeInputField;
	@FindBy(xpath ="//button[@class='icon-target icon-target-help-toggle icon-btn icon-btn-info ir ng-scope']")
	WebElement infoIcon;
	@FindBy(xpath ="//div[@class='field-message message-info ng-binding']/p")
	WebElement helpText;
	@FindBy(xpath ="//div[@label='Employment status']//div[@ng-bind-html='selectedContent']")
	WebElement clickEmploymentStatusField;
	@FindBy(xpath ="//div[@ng-model='ctrl.data.EmploymentStatus']//div//span")
	List<WebElement> selectDropDownValue;
	@FindBy(xpath ="//label[text()='Salary or wages per year (before tax)']/following::input[1]")
	WebElement salaryInputField;
	@FindBy(xpath ="//div[@ng-model='ctrl.data.KiwiSaverMemberContribution']//span[@class='input-label']/span")
	List<WebElement> kiwisaverMemberContribution;
	@FindBy(xpath ="//label[text()='Current KiwiSaver balance']/following::input[1]")
	WebElement currentKiwisaveBalance;
	@FindBy(xpath ="//label[text()='Voluntary contributions']/following::input[1]")
	WebElement voluntaryContributionPercentage;
	@FindBy(xpath ="//div[@label='Voluntary contributions']//div[@ng-bind-html='selectedContent']")
	WebElement clickvoluntaryContributionFrequency;
	@FindBy(xpath ="//div[@ng-model='$parent.period']//div//span")
	List<WebElement> selectvoluntaryContributionFrequency;
	@FindBy(xpath ="//div[@ng-model='ctrl.data.RiskProfile']//span[@class='input-label']/span")
	List<WebElement> selectRiskProfile;
	@FindBy(xpath ="//label[text()='Savings goal at retirement']/following::input[1]")
	WebElement inputSavingGoal;
	@FindBy(xpath ="//button[@class='btn btn-regular btn-results-reveal btn-has-chevron']")
	WebElement submitRetirementForm;

	//Info Icon Xpaths
	@FindBy(xpath ="//i[@class='icon']")
	List<WebElement> icon;
	@FindBy(xpath ="//i[@class='icon']/preceding::label")
	WebElement iconLabel;
	@FindBy(xpath ="//div[@class='field-message message-info ng-binding']/p")
	WebElement viewHelpText;

   public void selectDropDownValueForGivenLabel(List<WebElement> getAllvalues,String value) {
	   int count = getAllvalues.size();
	   for(int i=0;i<count;i++) {
		   String drodownValues = getAllvalues.get(i).getText();
		   if(drodownValues.equals(value)) {
			   getAllvalues.get(i).click();
			   break;
		   }
	   }
   }
   
   public void enterData(WebElement inputFiled, String inputValue) {
	   inputFiled.clear();
	   inputFiled.sendKeys(inputValue);
   }
   
   public void selectIframe() throws InterruptedException {
	   driver.switchTo().frame(SelectIFrame);
	   Thread.sleep(2000);
   }
	
   public void fillKiwisaveCalculator(String CurrentAge,String EmploymentStatus,String salaryWage,String kiwiSaverContribution,String currentKiwiSaverBalance,String voluntaryContribution,String voluntaryContributionFre,String riskProfile,String savingGoal) throws InterruptedException {
	    selectIframe();
	    enterData(currentAgeInputField,CurrentAge);
		clickEmploymentStatusField.click();
		selectDropDownValueForGivenLabel(selectDropDownValue,EmploymentStatus);
		if(EmploymentStatus=="Employed") {
		enterData(salaryInputField,salaryWage);
		selectDropDownValueForGivenLabel(kiwisaverMemberContribution,kiwiSaverContribution);
		}
		enterData(currentKiwisaveBalance,currentKiwiSaverBalance);
		enterData(voluntaryContributionPercentage,voluntaryContribution);
		clickvoluntaryContributionFrequency.click();
		selectDropDownValueForGivenLabel(selectvoluntaryContributionFrequency, voluntaryContributionFre);
		selectDropDownValueForGivenLabel(selectRiskProfile,riskProfile);
		enterData(inputSavingGoal,savingGoal);
		submitRetirementForm.click();
		driver.navigate().refresh();
		
	}
   
   public void validateHelpText(String fieldName, String expectedHelpText, int labelIndex) {
	   if(labelIndex==0) {
		   clickEmploymentStatusField.click();
		   selectDropDownValueForGivenLabel(selectDropDownValue,"Employed");
	   }
	   icon.get(labelIndex).click();
	   String actualHelpText = viewHelpText.getText();
	   Assert.assertTrue(expectedHelpText.equals(actualHelpText));
   }

   
}