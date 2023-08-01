package WebTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProgram1 {
	
public static void main(String[]args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	    driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		JavascriptExecutor JS = (JavascriptExecutor) driver;
		
		WebElement Element = driver.findElement(By.xpath("//h3[contains(text(),'Example')]"));
		
		JS.executeScript("arguments[0].scrollIntoView();",Element);
		
		//First way
		//How many rows in table
		
		int Row = driver.findElements(By.xpath("//table[@id=\'customers\']/tbody/tr")).size();
		
		System.out.println("Total number of rows --->" +Row);
		
		List<WebElement> Row1 = driver.findElements(By.xpath("//table[@id=\"customers\"]"));
		
		System.out.println("Total number of rows --->" +Row1.size());
		
		//How many columns in table
		
		int col = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/th")).size();
		
		System.out.println("Total number of col--->"+col);
		
		//Retrieve the specific row/col data
		
		String Data = driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr[4]/td[3]")).getText();
		
		System.out.println(Data);
		
		//Retrieve all row/col data
		
		for(int i = 2;i<=Row;i++) {
			
			for(int j =1;j<=col;j++) {
				
				String Data1 = driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr[" + i + "]/td[" + j + "]")).getText();
				System.out.print(Data1 +" | ");
			}
			System.out.println();
		}
		
		
		

}
}