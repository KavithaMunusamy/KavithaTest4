package org.nhs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WarPensionDetails extends PageBase {

	WebDriver driver;

	@CacheLookup
	@FindBy(id = "next-button")
	WebElement nextButton;

	
	@CacheLookup
	@FindBy(id = "radio-yes")
	WebElement warPension;
	@CacheLookup
	@FindBy(id = "radio-no")
	WebElement noWarPension;
	

	/**
	 * Constructor to obtain driver instance and initialise web elements
	 * 
	 * @param driver
	 */
	public WarPensionDetails(WebDriver webDriver) {
		this.driver = webDriver;
		PageFactory.initElements(driver, this);
	}

	/**
	 * Action method to choose whether receiving pension
	 * @param hasWarPension
	 */
	public void checkWarPensionDetails(boolean hasWarPension) {
		checkConditionAndProceed(hasWarPension, warPension, noWarPension, driver, nextButton);


	}

}
