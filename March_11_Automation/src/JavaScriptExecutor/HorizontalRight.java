package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HorizontalRight {
	
public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver","C:\\\\Users\\\\admin\\\\Desktop\\\\Selenium\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://blog.hubspot.com/website/horizontal-scrolling");
		
		JavascriptExecutor JS = (JavascriptExecutor) driver;
		
		JS.executeScript("window.scrollBy(1000,0)","");
		
		Thread.sleep(5000);
		
		JS.executeScript("window.scrollBy(-2000,0)","");
		
}

}
