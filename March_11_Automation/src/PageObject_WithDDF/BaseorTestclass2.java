package PageObject_WithDDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject_WithoutDDF.DashboardPage;
import PageObject_WithoutDDF.LoginPage;

public class BaseorTestclass2 {
	
	public static void main(String[]args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		LoginPage LP = new LoginPage(driver);
		
		//To fetch data from excel sheet
		
		String path ="C:\\Users\\admin\\eclipse-workspace\\March_11_Automation\\Read_Data\\Untitled spreadsheet_1.xlsx";
		
		FileInputStream file = new FileInputStream(path);
		
		Sheet Data = WorkbookFactory.create(file).getSheet("Sheet1");
		
		LP.GoTo();
		String UserID = Data.getRow(1).getCell(0).getStringCellValue();
		LP.Usermail(UserID);
		
		String Password = Data.getRow(1).getCell(1).getStringCellValue();
		
		LP.Password1(Password);
		LP.Login();
		
		DashboardPage DP = new DashboardPage(driver);
		DP.Namevalidation();
		DP.TimeAt();
		
		driver.quit();
		
	}

}
