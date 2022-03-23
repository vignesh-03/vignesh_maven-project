package org.pom_adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchhotel_Page {

	public WebDriver driver;

	@FindBy(id = "location")
	private WebElement location;
	@FindBy(id = "hotels")
	private WebElement hotel;
	@FindBy(xpath = "//select[@name='room_type']")
	private WebElement roomType;
	@FindBy(xpath = "//select[@name='room_nos']")
	private WebElement roomNos;
	@FindBy(xpath = "//input[@name='datepick_in']")
	private WebElement ckin;
	@FindBy(xpath = "//input[@name='datepick_out']")
	private WebElement ckout;
	@FindBy(xpath = "//select[@name='adult_room']")
	private WebElement adultRoom;
	@FindBy(xpath = "//select[@name='child_room']")
	private WebElement childrenRoom;
	@FindBy(id = "Submit")
	private WebElement submitBtn;

	public Searchhotel_Page(WebDriver driver2) {

			this.driver = driver2;
			PageFactory.initElements(driver, this);

		}
	public WebElement getLocation() {
		return location;
	}

	/**
	 * @return the hotel
	 */
	public WebElement getHotel() {
		return hotel;
	}

	/**
	 * @return the roomType
	 */
	public WebElement getRoomType() {
		return roomType;
	}

	/**
	 * @return the roomNos
	 */
	public WebElement getRoomNos() {
		return roomNos;
	}

	/**
	 * @return the ckin
	 */
	public WebElement getCkin() {
		return ckin;
	}

	/**
	 * @return the ckout
	 */
	public WebElement getCkout() {
		return ckout;
	}

	/**
	 * @return the adultRoom
	 */
	public WebElement getAdultRoom() {
		return adultRoom;
	}

	/**
	 * @return the childrenRoom
	 */
	public WebElement getChildrenRoom() {
		return childrenRoom;
	}

	/**
	 * @return the submitBtn
	 */
	public WebElement getSubmitBtn() {
		return submitBtn;
	}

	

	

}
