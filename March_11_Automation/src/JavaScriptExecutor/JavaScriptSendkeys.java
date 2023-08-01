package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptSendkeys {
	
public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver","C:\\\\Users\\\\admin\\\\Desktop\\\\Selenium\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement Username = driver.findElement(By.id("email"));
		WebElement Password = driver.findElement(By.id("pass"));
		
		JavascriptExecutor JS = (JavascriptExecutor) driver;
		
		//sendkeys
		//JS.executeScript("document.getElementById('email').value='Test123';");
		//JS.executeScript("document.getElementById('pass').value='253612';");
		
		//secondway
		
		JS.executeScript("arguments[0].value='"+ "Test" +"';", Username);
		JS.executeScript("arguments[0].value='"+ "Test1234" +"';", Password);
		
		
		

}
}