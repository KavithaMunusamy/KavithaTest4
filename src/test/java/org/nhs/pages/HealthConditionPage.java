package org.nhs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HealthConditionPage extends PageBase {

	WebDriver driver;

	@CacheLookup
	@FindBy(id = "next-button")
	WebElement nextButton;

	
	@CacheLookup
	@FindBy(id = "radio-yes")
	WebElement healthIssues;
	@CacheLookup
	@FindBy(id = "radio-no")
	WebElement noHealthIssues;
	

	/**
	 * Constructor to obtain driver instance and initialise web elements
	 * 
	 * @param driver
	 */
	public HealthConditionPage(WebDriver webDriver) {
		this.driver = webDriver;
		PageFactory.initElements(driver, this);
	}

	

	/**
	 * Action method to choose if GP in Scotland or Wales.
	 */
	public void checkHaveHealthIssues(boolean hasHealthIssues) {
		checkConditionAndProceed(hasHealthIssues, healthIssues, noHealthIssues, driver, nextButton);

	}

}
