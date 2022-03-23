package org.pom_adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {

	public WebDriver driver;// ------ null

	@FindBy(id = "username")
	private WebElement userName;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(id = "login")
	private WebElement loginbtn;

	public Home_Page(WebDriver driver2) {

		this.driver = driver2;

		PageFactory.initElements(driver, this);
	}

	public WebElement getUserName() {

		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

}
