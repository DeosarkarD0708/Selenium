package Popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PermissionPopup {
	
	public static void main(String[]args) throws InterruptedException {
		
		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("---disable-notifications");
		
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\Selenium\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.hdfcbank.com/");
			
			Thread.sleep(5000);
			driver.quit();
			
		
		
		
		
		
	}

}