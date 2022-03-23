package org.BaseClass_Concept;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {

	public static WebDriver driver;
	public static String value;

	public static WebDriver browser_config(String type) {

		if (type.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\\\Driver\\\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "\\\\Driver\\\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		// driver.manage().window().maximize();
		return driver;

	}

	public static void dropdown(String type, WebElement element, String value) {
		Select s = new Select(element);
		try {
			if (type.equalsIgnoreCase("byvalue")) {
				s.selectByValue(value);

			} else if (type.equalsIgnoreCase("bytext")) {

				s.selectByVisibleText(value);

			}

			else if (type.equalsIgnoreCase("byindex")) {

				int index = Integer.parseInt(value);
				s.selectByIndex(index);
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}

	public static void implicitwait() {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	}

	public static void clickmethod(WebElement element) {
		element.click();

	}

	public static void senddata(WebElement element, String data) {
		element.sendKeys(data);

	}

	public static void close() {
		driver.close();
	}

	public static void geturl(String url) {
		driver.get(url);

	}

	public static void screenshot(String s) throws IOException {
		TakesScreenshot t = (TakesScreenshot) driver;
		File source = t.getScreenshotAs(OutputType.FILE);
		File ss = new File(System.getProperty("user.dir") + "\\Screenshot\\" + s + ".png");
		FileUtils.copyFile(source, ss);

	}

	public static void scrollupanddown(WebElement name) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", name);
	}

	// read particular cell data

	public static String particular_data_Adactin(int Row_index, int Column_index) throws IOException {

		File f = new File("C:\\Users\\admin\\eclipse-workspace\\Maven_Project_Class\\Testcase-adactin.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet s = wb.getSheetAt(0);
		Row r = s.getRow(Row_index);

		Cell c = r.getCell(Column_index);

		CellType type = c.getCellType();

		if (type.equals(CellType.STRING)) {

			value = c.getStringCellValue();

		} else if (type.equals(CellType.NUMERIC)) {
			double numericCellValue = c.getNumericCellValue();
			int a = (int) numericCellValue;
			value = String.valueOf(a);
		}

		return value;
	}

//	read particular column data

	public static void Particular_column_Data() throws IOException {
		File f = new File("");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheetAt(0);
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {

			Row r = s.getRow(i);
			Cell c = r.getCell(1);
			CellType type = c.getCellType();
			if (type.equals(CellType.STRING)) {
				String value = c.getStringCellValue();
				System.out.println(value);

			} else if (type.equals(CellType.NUMERIC)) {
				double numericCellValue = c.getNumericCellValue();
				int d = (int) numericCellValue;
				String value = Integer.toString(d);

				System.out.println(value);
			}

		}
		wb.close();
	}

//	read particular row data

	public static void Particular_Data_Row() throws IOException {

		File f = new File("");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheetAt(0);
		Row r = s.getRow(1);

		for (int i = 0; i < r.getPhysicalNumberOfCells(); i++) {

			Cell c = r.getCell(i);
			CellType type = c.getCellType();
			if (type.equals(CellType.STRING)) {
				String value = c.getStringCellValue();
				System.out.println(value);

			} else if (type.equals(CellType.NUMERIC)) {
				double numericCellValue = c.getNumericCellValue();
				int d = (int) numericCellValue;
				String value = Integer.toString(d);
				System.out.println(value);
			}
		}

		wb.close();

	}

//	read all data
	public static void All_Data() throws IOException {

		File f = new File("X");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new HSSFWorkbook(fis);

		Sheet s = wb.getSheetAt(0);

		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {

			Row r = s.getRow(i);

			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {

				Cell c = r.getCell(j);

				CellType type = c.getCellType();

				if (type.equals(CellType.STRING)) {
					String value = c.getStringCellValue();
					System.out.println(value);

				} else if (type.equals(CellType.NUMERIC)) {
					double value = c.getNumericCellValue();
					int v = (int) value;
					String numeric = String.valueOf(v);

					System.out.println(numeric);

				}

				wb.close();

			}

		}
	}
}
