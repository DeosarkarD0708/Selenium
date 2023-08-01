package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighLightBorder {

public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver","C:\\\\Users\\\\admin\\\\Desktop\\\\Selenium\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement Element = driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"));
		
		JavascriptExecutor JS = (JavascriptExecutor) driver;
		WebElement Element1 = driver.findElement(By.id("email"));
		
		JS.executeScript("arguments[0].style.border = '15px solid red'", Element);
		JS.executeScript("arguments[0].style.border = '5px solid yellow'", Element1);
}
		
}
