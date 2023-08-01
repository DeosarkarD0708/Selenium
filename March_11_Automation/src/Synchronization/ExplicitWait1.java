package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait1 {
	
public static void main (String[]args){
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		WebDriverWait MyWait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		WebElement Element = MyWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("src")));
		
		Element.sendKeys("Pune");
		
        WebDriverWait MyWait1 = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		WebElement Element1 = MyWait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("dest1")));
		
		Element1.sendKeys("Mumbai");
		
		driver.quit();
		
		
		
		

}
}