package org.Datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.math3.ode.MainStateJacobianProvider;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data {

//	read particular cell data

	public static void particular_Cell_data() throws IOException {

		File f = new File("");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet s = wb.getSheetAt(0);
		Row r = s.getRow(1);

		Cell c = r.getCell(1);

		CellType type = c.getCellType();

		if (type.equals(CellType.STRING)) {

			String stringCellValue = c.getStringCellValue();

			System.out.println(stringCellValue);

		} else if (type.equals(CellType.NUMERIC)) {
			double numericCellValue = c.getNumericCellValue();
			int a = (int) numericCellValue;

			System.out.println(a);
		}

		wb.close();

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

	public static void main(String[] args) throws IOException {
		
		particular_Cell_data();
		System.out.println("---------------------------------------");
		Particular_column_Data();
		System.out.println("---------------------------------------");
		Particular_Data_Row();
		System.out.println("---------------------------------------");
		All_Data();

	}
}
