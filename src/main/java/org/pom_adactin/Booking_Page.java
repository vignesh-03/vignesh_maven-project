package org.pom_adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Page {

	public WebDriver driver;

	@FindBy(xpath = "//input[@name='first_name']")
	private WebElement fName;
	@FindBy(xpath = "//input[@name='last_name']")
	private WebElement lName;
	@FindBy(id = "address")
	private WebElement address;
	@FindBy(xpath = "//input[@name='cc_num']")
	private WebElement ccn;
	@FindBy(xpath = "//select[@name='cc_type']")
	private WebElement cardType;
	@FindBy(xpath = "//select[@name='cc_exp_month']")
	private WebElement expiryMonth;
	@FindBy(xpath = "//select[@name='cc_exp_year']")
	private WebElement expiryYear;
	@FindBy(xpath = "//input[@name='cc_cvv']")
	private WebElement ccvNo;
	@FindBy(xpath = "//input[@type='button']")
	private WebElement booknowbtn;
	@FindBy(id = "logout")
	private WebElement logoutBtn;

	
	

	public Booking_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);

	}

	/**
	 * @return the fName
	 */
	public WebElement getfName() {
		return fName;
	}

	/**
	 * @return the lName
	 */
	public WebElement getlName() {
		return lName;
	}

	/**
	 * @return the address
	 */
	public WebElement getAddress() {
		return address;
	}

	/**
	 * @return the ccn
	 */
	public WebElement getCcn() {
		return ccn;
	}

	/**
	 * @return the cardType
	 */
	public WebElement getCardType() {
		return cardType;
	}

	/**
	 * @return the expiryMonth
	 */
	public WebElement getExpiryMonth() {
		return expiryMonth;
	}

	/**
	 * @return the expiryYear
	 */
	public WebElement getExpiryYear() {
		return expiryYear;
	}

	/**
	 * @return the ccvNo
	 */
	public WebElement getCcvNo() {
		return ccvNo;
	}

	/**
	 * @return the booknowbtn
	 */
	public WebElement getBooknowbtn() {
		return booknowbtn;
	}
	public WebElement getLogoutBtn() {
		return logoutBtn;
	}

	
}
