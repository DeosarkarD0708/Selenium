package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orange_HRM_Without_DDF {

	public static void main(String[]args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//Enter username
		
		String Path = "C:\\Users\\admin\\eclipse-workspace\\March_11_Automation\\Read_Data\\Untitled spreadsheet_1.xlsx";
		
		FileInputStream File = new FileInputStream(Path);
		
		String Username = WorkbookFactory.create(File).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(Username);
		
		Thread.sleep(5000);
		
		//Enter Password
		
		FileInputStream File1 = new FileInputStream(Path);
		
		String Password = WorkbookFactory.create(File1).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(Password);
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		FileInputStream File2 = new FileInputStream(Path);
		
		String Name = WorkbookFactory.create(File2).getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		
		String UName = driver.findElement(By.xpath("//p[@class=\"oxd-userdropdown-name\"]")).getText();
		
		System.out.println(Name);
		if (UName.equals(Name)) {
			System.out.println("Correct user name or login successfully");
			}
		else
			System.out.println("Incorrect username or password");	
		
		
	}
}
