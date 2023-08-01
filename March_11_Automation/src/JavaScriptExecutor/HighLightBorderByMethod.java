package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighLightBorderByMethod {
	
public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver","C:\\\\Users\\\\admin\\\\Desktop\\\\Selenium\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement Element = driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"));
		WebElement Element1 = driver.findElement(By.id("email"));
		WebElement Element2 = driver.findElement(By.id("pass"));
		
		HighLightBorderByMethod.drawborder(driver,Element);
		HighLightBorderByMethod.drawborder(driver,Element1);
		HighLightBorderByMethod.drawborder(driver,Element2);
}

private static void drawborder(WebDriver driver, WebElement element) {
	
	JavascriptExecutor JS = (JavascriptExecutor) driver;
	JS.executeScript("arguments[0].style.border='5px solid red'", element);
	JS.executeScript("arguments[0].style.background='yellow'", element);
}
}
