package org.Datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class Write_data {

	public static void main(String[] args) throws Exception {

		File f = new File("C:\\Users\\admin\\Desktop\\Excel domo\\write.xls");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new HSSFWorkbook(fis);
		wb.createSheet("data").createRow(0).createCell(0).setCellValue("name");
		wb.getSheet("data").getRow(0).createCell(1).setCellValue("email id");
		wb.getSheet("data").getRow(0).createCell(2).setCellValue("password");
		wb.getSheet("data").createRow(1).createCell(0).setCellValue("vignesh");
		wb.getSheet("data").getRow(1).createCell(1).setCellValue("vignesh@gmail.com");
		wb.getSheet("data").getRow(1).createCell(2).setCellValue("v123");

		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		wb.close();
		System.out.println("write successfully");
	}
	
}
