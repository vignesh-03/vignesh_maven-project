package org.RunnerClass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Runner_Class_automation {public static void main(String[] args) throws IOException {

	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\admin\\eclipse-workspace\\Automation_project\\Driver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.get("http://automationpractice.com/index.php?id_category=8&controller=category");

	// driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	WebElement login = driver.findElement(By.xpath("//a[@class='login']"));
	login.click();

	WebElement email = driver.findElement(By.id("email"));
	email.sendKeys("iamvignesh03@gmail.com");

	WebElement password = driver.findElement(By.id("passwd"));
	password.sendKeys("vignesh");

	WebElement button = driver.findElement(By.id("SubmitLogin"));
	button.click();

	WebElement dress = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
	dress.click();

	WebElement casualdress = driver
			.findElement(By.xpath("(//a[contains(@title,'You are looking for a dress for every day?')])[1]"));
	casualdress.click();

	WebElement size = driver.findElement(By.xpath("(//input[@type='checkbox'])[3]"));
	size.click();

	WebElement list = driver.findElement(By.id("selectProductSort"));

	Select s = new Select(list);
	s.selectByValue("price:desc");

	WebElement img = driver.findElement(By.xpath("//img[@width='250']"));
	img.click();

	WebElement addcart = driver.findElement(By.name("Submit"));
	addcart.click();
	WebElement proceed = driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']"));
	proceed.click();

	WebElement proceesd1 = driver
			.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']"));
	proceesd1.click();

	WebElement proceesd2 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	proceesd2.click();

	WebElement agree = driver.findElement(By.id("cgv"));
	agree.click();

	WebElement proceesd3 = driver.findElement(By.name("processCarrier"));
	proceesd3.click();

	WebElement payment = driver.findElement(By.xpath("//a[@class='bankwire']"));
	payment.click();

	WebElement confirmorder = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	confirmorder.click();

	TakesScreenshot ts = (TakesScreenshot) driver;

	File location = ts.getScreenshotAs(OutputType.FILE);

	File dest = new File("C:\\Users\\admin\\eclipse-workspace\\Automation_project\\Screenshots\\hi.png");

	FileUtils.copyFile(location, dest);
	
	driver.close();
	

}

}

	
	
	


