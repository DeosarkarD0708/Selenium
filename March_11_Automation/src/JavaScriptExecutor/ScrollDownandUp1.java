package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownandUp1 {
	
	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver","C:\\\\Users\\\\admin\\\\Desktop\\\\Selenium\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/");
		
		JavascriptExecutor JS = (JavascriptExecutor) driver;
		
		//Scrolldown
		JS.executeScript("window.scrollBy(0,9000)","");
		
		Thread.sleep(5000);
		
		//ScrollUp
		JS.executeScript("window.scrollBy(0,-2000)","");
	}

}
