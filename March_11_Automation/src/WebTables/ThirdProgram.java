package WebTables;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThirdProgram {
	
public static void main(String[]args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	    driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		JavascriptExecutor JS = (JavascriptExecutor) driver;
		
		WebElement element = driver.findElement(By.xpath("//h3[contains(text(),'Example')]"));
		
		JS.executeScript("arguments[].scrollIntoView();",element);
		
		//List<WebElement>

}
}