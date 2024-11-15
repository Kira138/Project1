package Utilities;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtil {
	public  String getExcelData(String sheetName,int rowNum,int cellNum) throws Throwable
	{
		 FileInputStream fis2 = new FileInputStream("C:\\Users\\kiran\\Downloads\\MercuryTravels.xlsx");

         //step2:-open workbook in read mode
  	Workbook book= WorkbookFactory.create(fis2);

  	  //step3:-get the control of the Sheet
  	Sheet sheet = book.getSheet(sheetName);

  	//step4:- get control of the row
  	Row row = sheet.getRow(rowNum);

  	//step5:- get control of the cell
  	Cell cell = row.getCell(cellNum);

  	String ExcelData = cell.getStringCellValue();
	return ExcelData;
	}
//*****************************************************************************
public String getExcelDataUsingFormatter(String SheetName,int rowNum,int celNum) throws Throwable
	{
		//Step1:- give Connection between the physical file and test script
		FileInputStream fis = new FileInputStream("C:\\Users\\kiran\\eclipse-workspace\\Project1\\target\\test-classes\\MercuryTravels.xlsx");

		//step2:-keep excel file in read mode
		Workbook book = WorkbookFactory.create(fis);

	   //step3:-taking Control of the excel sheet
		Sheet sheet = book.getSheet(SheetName);

		//step4:-taking Control of the rows
		Row row = sheet.getRow(rowNum);

		//step5:-taking Control of the cell
		Cell cel = row.getCell(celNum);

		DataFormatter format = new DataFormatter();
		String ExcelData = format.formatCellValue(cel);
		System.out.println(ExcelData);
		return ExcelData;

	}
}
