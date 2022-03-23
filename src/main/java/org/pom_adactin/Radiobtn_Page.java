package org.pom_adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Radiobtn_Page {

	public WebDriver driver;

	@FindBy(xpath = "//input[@name='radiobutton_0']")
	private WebElement radioBtn;
	@FindBy(id ="continue")
	private WebElement continue_Btn;
	public Radiobtn_Page(WebDriver driver2) {
this.driver= driver2;
PageFactory.initElements(driver, this);
	
	}
	/**
	 * @return the radioBtn
	 */
	public WebElement getRadioBtn() {
		return radioBtn;
	}
	/**
	 * @return the continue_Btn
	 */
	public WebElement getContinue_Btn() {
		return continue_Btn;
	}

	

	
}
