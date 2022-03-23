package org.RunnerClass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.BaseClass_Concept.Base_Class;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.logger_demo.Property_Configs;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.pom_adactin.Booking_Page;
import org.pom_adactin.Home_Page;
import org.pom_adactin.Radiobtn_Page;
import org.pom_adactin.Searchhotel_Page;
import org.projectobjectmanager.Pom_Manager_Adactin;

public class Runner_Class_Adactin extends Base_Class {

	public static WebDriver driver = browser_config("chrome");

//	public static Home_Page hp = new Home_Page(driver);
//
//	public static Searchhotel_Page sp = new Searchhotel_Page(driver);
//
//	public static Radiobtn_Page rd = new Radiobtn_Page(driver);
//
//	public static Booking_Page bp = new Booking_Page(driver);

	public static Pom_Manager_Adactin pom = new Pom_Manager_Adactin(driver);

	public static Logger log = Logger.getLogger(Runner_Class_Adactin.class);

	public static void main(String[] args) throws InterruptedException, IOException {

		PropertyConfigurator.configure("log4j.properties");

		geturl("https://adactinhotelapp.com/");
		log.info("launch url");
		
		implicitwait();

		senddata(pom.getHp().getUserName(), particular_data_Adactin(0, 1));

		senddata(pom.getHp().getPassword(), particular_data_Adactin(1, 1));

		clickmethod(pom.getHp().getLoginbtn());

		Thread.sleep(3000);

		dropdown("byvalue", pom.getSp().getLocation(), particular_data_Adactin(2, 1));

		dropdown("bytext", pom.getSp().getHotel(), particular_data_Adactin(3, 1));

		dropdown("byvalue", pom.getSp().getRoomType(), particular_data_Adactin(4, 1));

		dropdown("byvalue", pom.getSp().getRoomNos(), particular_data_Adactin(5, 1));

		senddata(pom.getSp().getCkin(), particular_data_Adactin(6, 1));

		senddata(pom.getSp().getCkout(), particular_data_Adactin(7, 1));

		dropdown("byvalue", pom.getSp().getAdultRoom(), particular_data_Adactin(8, 1));

		dropdown("byindex", pom.getSp().getChildrenRoom(), particular_data_Adactin(9, 1));

		clickmethod(pom.getSp().getSubmitBtn());

		clickmethod(pom.getRb().getRadioBtn());

		clickmethod(pom.getRb().getContinue_Btn());

		senddata(pom.getBp().getfName(), particular_data_Adactin(10, 1));

		senddata(pom.getBp().getlName(), particular_data_Adactin(11, 1));

		senddata(pom.getBp().getAddress(), particular_data_Adactin(12, 1));

		senddata(pom.getBp().getCcn(), "1234567812345678");

		dropdown("byvalue", pom.getBp().getCardType(), particular_data_Adactin(13, 1));

		dropdown("byvalue", pom.getBp().getExpiryMonth(), particular_data_Adactin(14, 1));

		dropdown("byvalue", pom.getBp().getExpiryYear(), particular_data_Adactin(15, 1));

		senddata(pom.getBp().getCcvNo(), particular_data_Adactin(16, 1));

		clickmethod(pom.getBp().getBooknowbtn());

		Thread.sleep(10000);

		screenshot("adactin POM");

		Thread.sleep(20000);

		clickmethod(pom.getBp().getLogoutBtn());

		close();
	}

}
