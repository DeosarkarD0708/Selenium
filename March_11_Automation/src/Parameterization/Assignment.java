package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {public static void main(String[]args) throws IOException, InterruptedException {
	
	/*FileInputStream file = new FileInputStream("C:\\Users\\admin\\Desktop\\Employee.xlsx");
	
	String data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	
	System.out.println(data);
	
	FileInputStream file1 = new FileInputStream("C:\\Users\\admin\\Desktop\\Employee.xlsx");
	XSSFWorkbook workbook = new XSSFWorkbook(file1);
	
	String Data1 = workbook.getSheetAt(0).getRow(0).getCell(0).getStringCellValue();
	System.out.println(Data1);*/
	
//	System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\Selenium\\chromedriver.exe");
	String file ="C:\\Users\\admin\\Desktop\\Employee.xlsx";
	FileInputStream file1 = new FileInputStream(file);
	
	XSSFWorkbook work = new XSSFWorkbook(file1);
	
	XSSFSheet Sheet1 = work.getSheetAt(4);
	
	int Rows = Sheet1.getLastRowNum();
	System.out.println(Rows);
	
	
}
}
