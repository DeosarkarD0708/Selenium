package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ScrollDownAndUpTillBottom {
	
public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver","C:\\\\Users\\\\admin\\\\Desktop\\\\Selenium\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/");
		
		JavascriptExecutor JS = (JavascriptExecutor) driver; 
		
		JS.executeScript("window.scrollBy(0,document.body.scrollHeight)","");
		
		Thread.sleep(5000);
		
		JS.executeScript("document.document.scrollTop=0","");
}

}
