package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollByElements {
	
public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver","C:\\\\Users\\\\admin\\\\Desktop\\\\Selenium\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/");
		
		JavascriptExecutor JS = (JavascriptExecutor) driver;
		
		WebElement Name = driver.findElement(By.xpath("//h1[contains(text(),'W3Schools Spaces')]"));
		
		//ScrollByElement
		
	    JS.executeScript("arguments[0].scrollIntoView();", Name);
}

}
