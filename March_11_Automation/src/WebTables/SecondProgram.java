package WebTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondProgram {
	
public static void main(String[]args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	    driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		JavascriptExecutor JS = (JavascriptExecutor) driver;
		
		WebElement Element = driver.findElement(By.xpath("//h3[contains(text(),'Example')]"));
		
		//first way
		
		JS.executeScript("arguments[0].scrollIntoView();", Element);
		int Row = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
		System.out.println("Total number of Rows :"+Row);
		
		int col = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/th")).size();
		System.out.println("Total number of column  :"+col);
		
		//second way
		
		List<WebElement>Row1 = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr"));
		System.out.println("Total number of rows :" +Row1.size());
		
		List<WebElement>Col1 = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/th"));
		System.out.println("Total number of column :"+Col1.size());
		
		//Retrieve all data from table
		
		for(int i =2;i<=Row;i++) {//outer loop
			
			for(int j =1;j<=col;j++) {//inner loop
				
				String data = driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr[" +i+"]/td[" +j+"]")).getText();
				if(data.equals("Canada")) {
					
					System.out.println("Row number :" + i + ":"+"Col Number :"+ j);
					break;
				}
			}
		}
		

}
}