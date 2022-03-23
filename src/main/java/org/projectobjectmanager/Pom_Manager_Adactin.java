package org.projectobjectmanager;

import org.openqa.selenium.WebDriver;
import org.pom_adactin.Booking_Page;
import org.pom_adactin.Home_Page;
import org.pom_adactin.Radiobtn_Page;
import org.pom_adactin.Searchhotel_Page;

public class Pom_Manager_Adactin {
	public WebDriver driver;

	private Home_Page hp;
	private Booking_Page bp;
	private Radiobtn_Page rb;
	private Searchhotel_Page sp;

	public Pom_Manager_Adactin(WebDriver driver2) {

		this.driver = driver2;

	}

	public Home_Page getHp() {

		if (hp == null) {
			hp = new Home_Page(driver);
		}

		return hp;
	}

	public Booking_Page getBp() {

		if (bp == null) {
			bp = new Booking_Page(driver);
		}
		return bp;

	}

	public Radiobtn_Page getRb() {
		if (rb == null) {

			rb = new Radiobtn_Page(driver);
		}

		return rb;
	}

	public Searchhotel_Page getSp() {

		if (sp == null) {
			sp = new Searchhotel_Page(driver);
		}

		return sp;

	}
}
