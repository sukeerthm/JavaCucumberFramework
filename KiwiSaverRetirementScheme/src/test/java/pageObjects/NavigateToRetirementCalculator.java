package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NavigateToRetirementCalculator {
	
	WebDriver driver;
	
	public NavigateToRetirementCalculator(WebDriver driver) {
	
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(how = How.ID, using="ubermenu-section-link-kiwisaver-ps")
	static WebElement KiwiSaverMenu;
	@FindBy(how = How.ID, using="ubermenu-item-cta-kiwisaver-calculators-ps")
	static WebElement KiwiSaverCalculator;
	@FindBy(how = How.XPATH, using="//a[text()='Click here to get started.']")
	static WebElement ClickHereToGetStarted;
	
	public void openRetirementForm() throws InterruptedException {
		Actions actions = new Actions(driver);
	    actions.moveToElement(KiwiSaverMenu).perform();
		KiwiSaverCalculator.click();
		Thread.sleep(2000);
		ClickHereToGetStarted.click();
	}
	public void waitPageiSVisible() {
		driver.findElement(By.xpath("//label[text()='Current age']")).isEnabled();
	}
}
